package com.sourcecode.vo;

import java.util.Date;

/**
 *      订单查询对象
 */
public class OrderVo extends BaseVO{

    // 用户的交易状态（1：待付款 2：扫码成功  3：支付成功  4：订单关闭）
    private Integer tradeStatus;

    // 订单编号
    private String orderNumber;

    // 用户下单的开始时间
    private Date createTimeBegin;

    // 用户下单的结束时间
    private Date createTimeEnd;

    // 用户真正付款的开始时间
    private Date payTimeBegin;

    // 用户真正付款的结束时间
    private Date payTimeEnd;

    // 微信号
    private String wxCode;

    // qq号
    private String qqCode;

    // 订单交易号，是支付宝或者微信返回的第三方流水号
    private String outerTradeNo;

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Date getPayTimeBegin() {
        return payTimeBegin;
    }

    public void setPayTimeBegin(Date payTimeBegin) {
        this.payTimeBegin = payTimeBegin;
    }

    public Date getPayTimeEnd() {
        return payTimeEnd;
    }

    public void setPayTimeEnd(Date payTimeEnd) {
        this.payTimeEnd = payTimeEnd;
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
}
