package com.urancode.design.patterns.singleton;

/**
 * Created by Enson on 2023/12/7.
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    //上锁，线程同步方法（多线程阻塞）
    public synchronized static LazySimpleSingleton getInstanceV2() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    //上锁，双重锁检查,线程阻塞放到对实例判断时
    public static LazySimpleSingleton getInstanceV3() {
        if (lazy == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazy == null) {
                    lazy = new LazySimpleSingleton();
                }
            }
        }
        return lazy;
    }

}
