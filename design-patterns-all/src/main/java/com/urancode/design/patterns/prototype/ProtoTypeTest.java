package com.urancode.design.patterns.prototype;

import java.util.ArrayList;

/**
 * 原型模式
 *
 * Created by Enson on 2023/12/8.
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        try {

            ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
            concretePrototype.setAge(18);
            concretePrototype.setName("prototype");
            concretePrototype.setHobbies(new ArrayList<String>());
            System.out.println(concretePrototype);

            //浅克隆
            Clinet clinet = new Clinet(concretePrototype);
            ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) clinet.startClone(concretePrototype);
            System.out.println(concretePrototypeClone);
            System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHobbies());
            System.out.println("原对象中的引用类型地址值：" + concretePrototype.getHobbies());
            System.out.println("对象比较：" + (concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));
            System.out.println();

            QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
            //深克隆
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.hobbies == clone.hobbies));

            QiTianDaSheng qClone = qiTianDaSheng.shallowClone(qiTianDaSheng);
            System.out.println("浅克隆：" + (qiTianDaSheng.hobbies == qClone.hobbies));

            //克隆破坏单例模式

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
