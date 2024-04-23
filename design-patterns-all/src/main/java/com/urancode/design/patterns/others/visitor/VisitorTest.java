package com.urancode.design.patterns.others.visitor;

import com.urancode.design.patterns.others.visitor.shapes.*;

/**
 * 访问者模式
 * Created by xiayx on 2021/2/3.
 */
public class VisitorTest {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangles rectangle = new Rectangles(3, 10, 17, 20, 30);

        //访问者编排
        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        //执行具体访问者任务
        export(circle, compoundShape);
    }

    private static void export(IShape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
