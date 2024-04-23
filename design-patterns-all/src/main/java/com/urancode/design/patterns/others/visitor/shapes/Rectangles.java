package com.urancode.design.patterns.others.visitor.shapes;

import com.urancode.design.patterns.others.visitor.Visitor;

/**
 * Created by xiayx on 2021/2/3.
 */
public class Rectangles implements IShape {
    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangles(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
