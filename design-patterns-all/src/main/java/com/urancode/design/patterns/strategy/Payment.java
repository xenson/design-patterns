package com.urancode.design.patterns.strategy;

/**
 * Created by Enson on 2023/12/8.
 */
public abstract class Payment {
    public abstract String getName();

    public abstract double queryBalance(String uid);

    public PayState pay(String uid, Double amount) {
        if (queryBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        }
        return new PayState(200, "支付成功", "支付金额：" + amount);
    }
}
