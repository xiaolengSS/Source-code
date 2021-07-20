package com.sourcecode.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *      七牛配置
 */
@Configuration
public class QiNiuConfig {

    // 七牛图片域名domain
    @Value("${oss.qiniu.imagesDomain}")
    private String imagesDomain;

    // 七牛视频域名domain
    @Value("${oss.qiniu.videosDomain}")
    private String videosDomain;

    // 七牛ACCESS_KEY
    @Value("${oss.qiniu.accessKey}")
    private String accessKey;

    // 七牛SECRET_KEY
    @Value("${oss.qiniu.secretKey}")
    private String secretKey;

    // 七牛图片空间名
    @Value("${oss.qiniu.imagesBucketName}")
    private String imagesBucketName;

    // 七牛视频空间名
    @Value("${oss.qiniu.videosBucketName}")
    private String videosBucketName;

    public String getImagesDomain() {
        return imagesDomain;
    }

    public void setImagesDomain(String imagesDomain) {
        this.imagesDomain = imagesDomain;
    }

    public String getVideosDomain() {
        return videosDomain;
    }

    public void setVideosDomain(String videosDomain) {
        this.videosDomain = videosDomain;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getImagesBucketName() {
        return imagesBucketName;
    }

    public void setImagesBucketName(String imagesBucketName) {
        this.imagesBucketName = imagesBucketName;
    }

    public String getVideosBucketName() {
        return videosBucketName;
    }

    public void setVideosBucketName(String videosBucketName) {
        this.videosBucketName = videosBucketName;
    }
}
