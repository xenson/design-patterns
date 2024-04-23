package com.urancode.design.patterns.factory.factorymethod;

import com.urancode.design.patterns.factory.simplefactory.ICoures;

/**
 * 工厂方法模式
 *
 * 定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类
 * 让类的实例化推迟到子类中进行
 * <p>
 * Created by Enson on 2023/12/7.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //客户知道需求，造工厂，工厂实现产品
        ICourseFactory factory = new PythonCourseFactory();
        ICoures course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

        System.out.println();
    }
}
