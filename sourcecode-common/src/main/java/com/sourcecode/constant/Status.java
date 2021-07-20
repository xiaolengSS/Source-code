package com.sourcecode.constant;

/**
 *      状态常量
 */
public enum Status {

    ENABLE(1,"启用"),
    DISABLE(0,"禁用");

    // 提示信息
    private String msg;

    // 类型
    private Integer type;

    Status(Integer type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getType() {
        return type;
    }
}
