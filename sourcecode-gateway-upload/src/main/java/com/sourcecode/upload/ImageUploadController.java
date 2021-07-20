package com.sourcecode.upload;

import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.BaseUploadService;
import com.sourcecode.service.ImagesUploadService;
import com.sourcecode.utils.FileNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *      文件上传Controller
 */
@RestController
@RequestMapping(value = "/image/upload")
@CrossOrigin
public class ImageUploadController extends BaseUploadController{

    @Autowired
    private ImagesUploadService imagesUploadService;

    @Override
    public BaseUploadService getUploadService() {
        return imagesUploadService;
    }

    /**
     *  多图片上传
    */
    @RequestMapping(value = "/uploadImages",method = RequestMethod.POST)
    public ResponseResult uploadImages(@RequestParam("file")MultipartFile[] files) throws IOException {
        return super.uploadFiles(files);
    }
}
