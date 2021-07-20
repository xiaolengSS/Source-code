package com.sourcecode.vo;

/**
 *  基础数据传输实体
 */
public class BaseVO {

    // 当前页，默认第一页
    private Integer currentPage = 1;

    // 每页显示条数
    private Integer pageSize = 10;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
