package com.urancode.design.patterns.singleton;

/**
 * Created by Enson on 2023/12/7.
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    //静态代码块机制
    private static final HungrySingleton HUNGRY_SINGLETON_V2;

    static {
        HUNGRY_SINGLETON_V2 = new HungrySingleton();
    }

    public static HungrySingleton getInstanceV2() {
        return HUNGRY_SINGLETON_V2;
    }
}
