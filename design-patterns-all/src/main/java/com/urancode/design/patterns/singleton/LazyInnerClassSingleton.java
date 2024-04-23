package com.urancode.design.patterns.singleton;

/**
 * Created by Enson on 2023/12/7.
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        //防止反射破坏单例
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //static是为使单例的空间共享，保证方法不被重写、重载
    public static final LazyInnerClassSingleton getInstance() {
        //返回结果前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载，内部类一定是在方法调用之前加载，避免线程安全 - 内部静态类方式，解决阻塞引起的性能问题
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
