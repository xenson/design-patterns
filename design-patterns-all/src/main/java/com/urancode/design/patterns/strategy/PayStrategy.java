package com.urancode.design.patterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略管理
 * <p>
 * Created by Enson on 2023/12/8.
 */
public class PayStrategy {
    public static final String ALI_PAY = "Alipay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> payStrategy = new HashMap<String, Payment>();

    static {
        payStrategy.put(ALI_PAY, new Alipay());
        payStrategy.put(WECHAT_PAY, new WechatPay());
    }

    public static Payment get(String payKey) {
        if (payStrategy.containsKey(payKey)) {
            return payStrategy.get(payKey);
        }
        return payStrategy.get(payKey);
    }
}
