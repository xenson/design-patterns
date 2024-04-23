package com.urancode.design.patterns.others.visitor.shapes;

import com.urancode.design.patterns.others.visitor.Visitor;

/**
 * Created by xiayx on 2021/2/3.
 */
public class Circle extends Dot{

    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
