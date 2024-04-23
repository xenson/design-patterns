package com.urancode.design.patterns.others.visitor.shapes;

import com.urancode.design.patterns.others.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiayx on 2021/2/3.
 */
public class CompoundShape implements IShape {
    public int id;
    public List<IShape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(IShape shape) {
        children.add(shape);
    }
}
