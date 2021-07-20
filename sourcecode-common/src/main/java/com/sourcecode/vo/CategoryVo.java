package com.sourcecode.vo;

/**
 *  分类查询对象
 */
public class CategoryVo extends BaseVO{

    // 分类名称
    private String cname;

    // 分类状态
    private Integer status;

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
}
