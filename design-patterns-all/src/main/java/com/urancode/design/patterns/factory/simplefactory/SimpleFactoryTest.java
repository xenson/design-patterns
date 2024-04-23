package com.urancode.design.patterns.factory.simplefactory;

/**
 * 简单工厂模式
 *
 * 优点：
 * 缺点：职责相对过重，不易于扩展过于复杂的产品结构
 *
 * Created by Enson on 2023/12/7.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //客户知道具体工厂，工厂实现产品
        CourseFactory factory = new CourseFactory();

        //V1
        ICoures javaCourse = factory.create("java");
        javaCourse.record();

        //V2
        ICoures javaCourseV2 = factory.createV2("com.urancode.design.patterns.factory.simplefactory.JavaCourse");
        javaCourseV2.record();

        //V3
        ICoures javaCourseV3 = factory.createV3(JavaCourse.class);
        javaCourseV3.record();

        System.out.println();
    }
}
