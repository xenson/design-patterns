package com.urancode.design.patterns.delegate;

/**
 * Created by Enson on 2023/12/8.
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
