package com.urancode.design.patterns.strategy;

/**
 * 策略模式
 * <p>
 * Created by Enson on 2023/12/8.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "201803110010000009", 324.45);
        System.out.println(order.pay(PayStrategy.ALI_PAY));

        System.out.println();
    }
}
