package com.urancode.design.patterns.strategy;

/**
 * Created by Enson on 2023/12/8.
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString() {
        return "支付状态：[" + code + "]，" + msg + "交易详情；" + data;
    }
}
