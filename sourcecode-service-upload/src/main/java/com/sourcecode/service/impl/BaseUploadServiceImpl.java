package com.sourcecode.service.impl;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.sourcecode.config.QiNiuConfig;
import com.sourcecode.service.BaseUploadService;

import java.io.ByteArrayInputStream;

/**
 *  基础的文件上传Service业务实现
 */
public abstract class BaseUploadServiceImpl implements BaseUploadService {

    // 七牛文件上传管理器
    private UploadManager uploadManager;
    private String token;

    // 七牛认证管理
    private Auth auth;

    // 七牛配置
    protected QiNiuConfig config;

    public BaseUploadServiceImpl(QiNiuConfig config){
        this.config = config;
        this.init();
    }

    private void init(){
        // 构造一个带指定Zone对象的配置类, 注意这里的Zone.zone1需要根据主机选择,我选择的是华北
        uploadManager = new UploadManager(new Configuration(Zone.zone1()));
        auth = Auth.create(config.getAccessKey(), config.getSecretKey());
        // 根据命名空间生成的上传token
        token = auth.uploadToken(this.getBucketName());
    }

    @Override
    public String uploadQNFile(ByteArrayInputStream file, String key) {
        try{
            // 上传文件
            Response res = uploadManager.put(file, key, token, null, null);
            if (!res.isOK()) {
                throw new RuntimeException("上传七牛出错：" + res.toString());
            }
            // 解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(res.bodyString(), DefaultPutRet.class);

            String path = this.getDomain() + "/" + putRet.key;
            // 这个returnPath是获得到的外链地址,通过这个地址可以直接打开图片
            return path;
        }catch (QiniuException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // 获取指定的bucketName 名称空间
    public abstract String getBucketName();

    // 获取指定的domain
    public abstract String getDomain();
}
