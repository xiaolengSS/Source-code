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
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

/**
 *  文件上传Service 实现
 */
@Service
public class ImagesUploadServiceImpl extends BaseUploadServiceImpl implements ImagesUploadService {

    public ImagesUploadServiceImpl(QiNiuConfig config) {
        super(config);
    }

    @Override
    public String getBucketName() {
        return config.getImagesBucketName();
    }

    @Override
    public String getDomain() {
        return config.getImagesDomain();
    }
}
