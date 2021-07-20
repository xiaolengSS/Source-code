package com.sourcecode.service;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

/**
 *      基础的文件上传工具类
 */
public interface BaseUploadService {

    // 文件上传
    public String uploadQNFile(ByteArrayInputStream file, String key);

}
