package com.urancode.design.patterns.observer;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Enson on 2023/12/21.
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str) {
        //业务逻辑
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
