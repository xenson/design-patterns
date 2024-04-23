package com.urancode.design.patterns.decorator;

/**
 * 装饰者模式
 * <p>
 * Created by Enson on 2023/12/21.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Battercake battercake;
        //一个煎饼
        battercake = new BaseBatterCake();
        //加1个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加1个鸡蛋
        battercake = new EggDecorator(battercake);
        //加1根香肠
        battercake = new SausageDecorator(battercake);

        //装饰者模式更多考虑扩展
        System.out.println(battercake.getMsg() + "，总价：" + battercake.getPrice());
    }
}
