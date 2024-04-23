package com.urancode.design.patterns.strategy;

/**
 * Created by Enson on 2023/12/8.
 */
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 256;
    }
}
