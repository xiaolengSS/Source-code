package com.sourcecode.response;

/**
 *      响应结果
 */
public class ResponseResult {

    private Object data;

    private String msg;

    private Integer code;

    public ResponseResult() {
    }

    public ResponseResult(Object data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    // 执行操作成功
    public static ResponseResult ok() {
        return new ResponseResult(null,"操作成功!",200);
    }

    // 执行操作失败
    public static ResponseResult fail() {
        return new ResponseResult(null,"操作失败!",500);
    }

    // 返回数据
    public static ResponseResult returnData(Object data) {
        return new ResponseResult(data,"操作成功!",200);
    }

    // 查询不到数据
    public static ResponseResult notFound() {
        return new ResponseResult(null,"查询的数据不存在!",404);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
