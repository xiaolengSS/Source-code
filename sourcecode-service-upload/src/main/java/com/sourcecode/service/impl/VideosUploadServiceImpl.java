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
import com.sourcecode.service.ImagesUploadService;
import com.sourcecode.service.VideosUploadService;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

/**
 *  文件上传Service 实现
 */
@Service
public class VideosUploadServiceImpl extends BaseUploadServiceImpl implements VideosUploadService {

    public VideosUploadServiceImpl(QiNiuConfig config){
        super(config);
    }

    @Override
    public String getBucketName() {
        return config.getVideosBucketName();
    }

    @Override
    public String getDomain() {
        return config.getVideosDomain();
    }
}
