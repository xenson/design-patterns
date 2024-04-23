package com.urancode.design.patterns.prototype;

/**
 * Created by Enson on 2023/12/8.
 */
public class Clinet {
    private Prototype prototype;

    public Clinet(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype) {
        return (Prototype) concretePrototype.clone();
    }
}
