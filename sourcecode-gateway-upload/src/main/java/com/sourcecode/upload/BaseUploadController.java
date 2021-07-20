package com.sourcecode.upload;

import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.BaseUploadService;
import com.sourcecode.utils.FileNameUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *      基础的文件上传工具类
 */
public abstract class BaseUploadController {

    public abstract BaseUploadService getUploadService();

    public ResponseResult uploadFiles(@RequestParam("file") MultipartFile[] files) throws IOException {

        // 保存所有的七牛返回的
        List<String> paths = new ArrayList<>();

        // 循环遍历实现文件上传
        for (int i = 0 ; files != null && i < files.length ; i++){
            MultipartFile file = files[i];
            if (file != null){
                // 获取文件的名称
                String fileName = file.getOriginalFilename();

                // 使用工具类根据上传文件生成唯一图片名称
                String imgName = FileNameUtils.getRandomImgName(fileName);

                ByteArrayInputStream inputStream = (ByteArrayInputStream) file.getInputStream();

                // 获取七牛云的图片外网链接
                String path = getUploadService().uploadQNFile(inputStream, imgName);

                // 保存到集合中
                paths.add(path);
            }
        }
        return ResponseResult.returnData(paths);
    }
}
