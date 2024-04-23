package com.urancode.design.patterns.singleton;

/**
 * Created by Enson on 2023/12/7.
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstanceV3();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
