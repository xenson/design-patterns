package com.urancode.design.patterns.others.visitor.shapes;

import com.urancode.design.patterns.others.visitor.Visitor;

/**
 * Created by xiayx on 2021/2/3.
 */
public interface IShape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
