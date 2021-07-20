package com.sourcecode.domain;

import java.io.Serializable;

/**
 *  商品视频
 */
public class ProductVideo implements Serializable {

    // 对象id
    private Integer id;

    // 视频url地址
    private String videoUrl;

    // 图片状态(默认启用（0: 不启用，1: 启用）
    private Integer status = 1;

    // 所属商品
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductVideo{" +
                "id=" + id +
                ", videoUrl='" + videoUrl + '\'' +
                ", status=" + status +
                '}';
    }
}
