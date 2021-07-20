package com.sourcecode.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 商品
 */
public class Product implements Serializable {

    // 对象id
    private Integer id;

    // 商品的标题，名称
    private String title;

    // 标签，关键字
    private String tags;

    // 源代码的体积，有多少兆
    private String size;

    // 用的什么编程语言开发
    private String devLanguage;

    // 是windows还是linux平台下的运行
    private String runPlatform;

    // 开发工具，是eclipse还是idea
    private String devTools;

    // 商品的价格
    private BigDecimal price;

    // 是否上架，上传的代码需要审核，默认不上架(1:上架，0:不上架)
    private Integer status = 0;

    // 商品上传的时间，提交到系统的时间
    private Date uploadTime;

    // 审核时间，也就是上架的时间
    private Date checkTime;

    // 修改商品的时间
    private Date updatedTime;

    // 所属分类，是Java、C++等，课程设计
    private Category category;

    // 关联的商品详情
    private ProductDesc productDesc;

    // 有多张商品主图
    private List<ProductImages> productImages;

    // 有多个商品视频
    private List<ProductVideo> productVideos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDevLanguage() {
        return devLanguage;
    }

    public void setDevLanguage(String devLanguage) {
        this.devLanguage = devLanguage;
    }

    public String getRunPlatform() {
        return runPlatform;
    }

    public void setRunPlatform(String runPlatform) {
        this.runPlatform = runPlatform;
    }

    public String getDevTools() {
        return devTools;
    }

    public void setDevTools(String devTools) {
        this.devTools = devTools;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductDesc getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(ProductDesc productDesc) {
        this.productDesc = productDesc;
    }

    public List<ProductImages> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImages> productImages) {
        this.productImages = productImages;
    }

    public List<ProductVideo> getProductVideos() {
        return productVideos;
    }

    public void setProductVideos(List<ProductVideo> productVideos) {
        this.productVideos = productVideos;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tags='" + tags + '\'' +
                ", size='" + size + '\'' +
                ", devLanguage='" + devLanguage + '\'' +
                ", runPlatform='" + runPlatform + '\'' +
                ", devTools='" + devTools + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", uploadTime=" + uploadTime +
                ", checkTime=" + checkTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
