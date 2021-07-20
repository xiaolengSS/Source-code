package com.sourcecode.domain;

import java.io.Serializable;

/**
 *      商品详情
 */
public class ProductDesc implements Serializable {

    // 对象id
    private Integer id;

    // 商品描述
    private String info;

    // 所属商品
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductDesc{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
