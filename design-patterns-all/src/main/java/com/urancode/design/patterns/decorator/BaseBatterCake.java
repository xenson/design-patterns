package com.urancode.design.patterns.decorator;

/**
 * Created by Enson on 2023/12/21.
 */
public class BaseBatterCake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
