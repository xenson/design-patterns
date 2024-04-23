package com.urancode.design.patterns.template;

/**
 * 模板模式
 * <p>
 * 不变的行为放父类，不同的代码流程放子类
 * 钩子方法可根据实际业务需求进行流程微调
 * <p>
 * Created by Enson on 2023/12/20.
 */
public class TemplateTest {
    public static void main(String[] args) {

        System.out.println("---Java架构师课程---");
        NetworCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println();

        System.out.println("---大数据课程---");
        NetworCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }
}
