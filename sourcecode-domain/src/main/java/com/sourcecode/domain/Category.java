package com.sourcecode.domain;

import java.io.Serializable;

/**
 *      分类
 */
public class Category implements Serializable {

    // 对象id
    private Integer id;

    // 分类名称
    private String cname;

    // 状态，(0:表示删除，1表示不删除，启用)，默认不删除,启用
    private Integer status = 1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", status=" + status +
                '}';
    }
}
