package com.urancode.design.patterns.others.composite.shapes;

import java.awt.*;

/**
 * Created by xiayx on 2021/2/3.
 */
public interface IShape {
    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void move(int x, int y);

    boolean isInsideBounds(int x, int y);

    void select();

    void unSelect();

    boolean isSelected();

    void paint(Graphics graphics);
}
