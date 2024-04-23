package com.urancode.design.patterns.singleton;

/**
 * 单例模式
 *
 * Created by Enson on 2023/12/7.
 */
public class SingletonTest {
    public static void main(String[] args) {
        //饿汉单例
        HungrySingleton singleton = HungrySingleton.getInstance();
        System.out.println(singleton.hashCode());

        HungrySingleton singletonV2 = HungrySingleton.getInstanceV2();
        System.out.println(singletonV2.hashCode());

        //懒汉单例 - 线程安全
//        LazySimpleSingleton lazySingleton = LazySimpleSingleton.getInstance();
//        System.out.println(lazySingleton.hashCode());
        //一定概率出现不同结果，存在线程安全隐患
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

        //绝对线程安全-全局唯一实例
        LazyInnerClassSingleton lazyInnerSingleton = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInnerSingleton.hashCode());

        //反射破坏单例
        //序列化破坏单例

        //注册式单例-1.枚举式单例 2.容器式单例-非线程安全

        System.out.println();
    }
}
