package com.sourcecode.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单
 */
public class Order implements Serializable {

    // 对象id
    private Integer id;

    // 订单编号
    private String orderNumber;

    // 将来系统涉及到用户登录成为会员，需要记录登录用户的id前期可能为null;不需要登录直接购买
    private Integer buyerId;

    // 将来系统涉及到用户登录成为会员，需要记录登录用户的登录账号前期可能为null;不需要登录直接购买
    private String buyerName;

    // 订单支付来源，是支付宝还是微信
    private String payTradeSource;

    // 用户不登录，直接扫码购买，记录用户的支付宝opendId
    private String zfbOpenId;

    // 用户的支付宝昵称
    private String zfbNickName;

    // 用户支付宝的登录账号，一般来说是手机号
    private String zfbAccount;

    // 微信标识用户id
    private String wxOpenId;

    // 用户登录微信的昵称
    private String wxNickName;

    // 用户登录微信的账号，一般来说是手机号
    private String wxAccount;

    // 买家其他补充信息
    private String buyerOther;

    // 用户的交易状态（1：待付款 2：扫码成功  3：支付成功  4：订单关闭）
    private Integer tradeStatus = 1;

    // 订单金额，是指所购商品的总金额，不含任何优惠的金额
    private BigDecimal orderAmount;

    // 是用户实际需要付款的金额，可能实际付款金额要比订单金额要少。比如：会员享受订单金额的9%。前期，付款金额=订单金额，不过要以付款金额为准
    private BigDecimal payAmount;

    // 用户下单的时间
    private Date createTime;

    // 用户真正付款的时间
    private Date payTime;

    // 用户下单时候的备注，比如说该源码是否需要远程调试，安装部署等，下单可以留言
    private String note;

    // 下单的同时勾选是否需要购买侯帮助安装，部署等除了源代码之外的协助，可能会产生其他费用，需要额外沟通
    private Integer isHelp;

    // 用户填写微信号，方便后期沟通
    private String wxCode;

    // 用户填写qq号，方便后期沟通
    private String qqCode;

    // 订单交易号，是支付宝或者微信返回的第三方流水号
    private String outerTradeNo;

    // 订单所关联的订单明细
    private List<OrderItem> orderItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getPayTradeSource() {
        return payTradeSource;
    }

    public void setPayTradeSource(String payTradeSource) {
        this.payTradeSource = payTradeSource;
    }

    public String getZfbOpenId() {
        return zfbOpenId;
    }

    public void setZfbOpenId(String zfbOpenId) {
        this.zfbOpenId = zfbOpenId;
    }

    public String getZfbNickName() {
        return zfbNickName;
    }

    public void setZfbNickName(String zfbNickName) {
        this.zfbNickName = zfbNickName;
    }

    public String getZfbAccount() {
        return zfbAccount;
    }

    public void setZfbAccount(String zfbAccount) {
        this.zfbAccount = zfbAccount;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getWxNickName() {
        return wxNickName;
    }

    public void setWxNickName(String wxNickName) {
        this.wxNickName = wxNickName;
    }

    public String getWxAccount() {
        return wxAccount;
    }

    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getBuyerOther() {
        return buyerOther;
    }

    public void setBuyerOther(String buyerOther) {
        this.buyerOther = buyerOther;
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getIsHelp() {
        return isHelp;
    }

    public void setIsHelp(Integer isHelp) {
        this.isHelp = isHelp;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getQqCode() {
        return qqCode;
    }

    public void setQqCode(String qqCode) {
        this.qqCode = qqCode;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", buyerId=" + buyerId +
                ", buyerName='" + buyerName + '\'' +
                ", payTradeSource='" + payTradeSource + '\'' +
                ", zfbOpenId='" + zfbOpenId + '\'' +
                ", zfbNickName='" + zfbNickName + '\'' +
                ", zfbAccount='" + zfbAccount + '\'' +
                ", wxOpenId='" + wxOpenId + '\'' +
                ", wxNickName='" + wxNickName + '\'' +
                ", wxAccount='" + wxAccount + '\'' +
                ", buyerOther='" + buyerOther + '\'' +
                ", tradeStatus=" + tradeStatus +
                ", orderAmount=" + orderAmount +
                ", payAmount=" + payAmount +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", note='" + note + '\'' +
                ", isHelp=" + isHelp +
                ", wxCode='" + wxCode + '\'' +
                ", qqCode='" + qqCode + '\'' +
                ", outerTradeNo='" + outerTradeNo + '\'' +
                '}';
    }
}
