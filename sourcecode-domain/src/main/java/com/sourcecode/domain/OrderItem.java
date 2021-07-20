package com.sourcecode.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单明细
 */
public class OrderItem implements Serializable {

    // 主键id
    private Integer id;

    // 商品名称，也就是商品标题，商品可以修改，但是下单之后的商品名字一定是不能修改的
    private String productName;

    // 外键，关联的商品表，对于商品的其他的属性信息，还是需要能够跟踪获取到的
    private Integer productId;

    // 商品的实际价格，是多少就是多少
    private BigDecimal productPrice;

    // 商品买多少数量
    private Integer amount;

    // 商品总价
    private BigDecimal productAmount;

    // 所属订单
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", amount=" + amount +
                ", productAmount=" + productAmount +
                '}';
    }
}
