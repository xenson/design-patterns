package com.urancode.design.patterns.others.composite.shapes;

import java.awt.*;

/**
 * Created by xiayx on 2021/2/3.
 */
public class Rectangles extends BaseShape {
    public int width;
    public int height;

    public Rectangles(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
