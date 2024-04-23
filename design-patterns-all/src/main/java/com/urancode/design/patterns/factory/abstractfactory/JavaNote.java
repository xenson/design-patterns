package com.urancode.design.patterns.factory.abstractfactory;

/**
 * Created by Enson on 2023/12/7.
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
