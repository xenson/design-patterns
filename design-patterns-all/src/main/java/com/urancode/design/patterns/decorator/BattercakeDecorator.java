package com.urancode.design.patterns.decorator;

/**
 * Created by Enson on 2023/12/21.
 */
public abstract class BattercakeDecorator extends Battercake {

    //静态代理，委派
    private Battercake battercak;

    public BattercakeDecorator(Battercake battercake) {
        this.battercak = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercak.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercak.getPrice();
    }
}
