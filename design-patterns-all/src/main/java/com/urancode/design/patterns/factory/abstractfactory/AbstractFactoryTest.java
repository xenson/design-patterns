package com.urancode.design.patterns.factory.abstractfactory;


/**
 * 抽象工厂模式
 *
 * 可实现多工厂，多产品扩展
 * 如果扩展产品等级（只要不频繁升级，可牺牲开闭原则），从抽象工厂到具体工厂都要调整，不符合开闭原则
 *
 * Created by Enson on 2023/12/7.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //客户有能力有需求，打造标准工厂，工厂实现产品
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();

        PythonCourseFactory factory1 = new PythonCourseFactory();
        factory1.createNote().edit();
        factory1.createVideo().record();

        System.out.println();
    }
}
