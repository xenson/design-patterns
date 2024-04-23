package com.urancode.design.patterns.strategy;

/**
 * Created by Enson on 2023/12/8.
 */
public class Alipay extends Payment{

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 900;
    }
}
