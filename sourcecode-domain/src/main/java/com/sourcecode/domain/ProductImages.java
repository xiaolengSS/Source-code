package com.sourcecode.domain;

import java.io.Serializable;

/**
 *  商品主图
 */
public class ProductImages implements Serializable {

    // 对象id
    private Integer id;

    // 图片url地址
    private String imageUrl;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
        return "ProductImages{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", status=" + status +
                '}';
    }
}
