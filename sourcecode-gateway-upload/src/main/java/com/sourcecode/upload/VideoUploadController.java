package com.sourcecode.upload;

import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.BaseUploadService;
import com.sourcecode.service.VideosUploadService;
import com.sourcecode.utils.FileNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/video/upload")
@CrossOrigin
public class VideoUploadController extends BaseUploadController{

    @Autowired
    private VideosUploadService videosUploadService;

    @Override
    public BaseUploadService getUploadService() {
        return videosUploadService;
    }

    /**
     *  多视频上传
     */
    @RequestMapping(value = "/uploadVideos",method = RequestMethod.POST)
    public ResponseResult uploadVideos(@RequestParam("file") MultipartFile[] files) throws IOException {
        return super.uploadFiles(files);
    }
}
