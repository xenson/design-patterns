package com.urancode.design.patterns.others.composite;

import com.urancode.design.patterns.others.composite.shapes.Circle;
import com.urancode.design.patterns.others.composite.shapes.CompoundShape;
import com.urancode.design.patterns.others.composite.shapes.Dot;
import com.urancode.design.patterns.others.composite.shapes.Rectangles;

import java.awt.*;

/**
 * 组合模式
 * Created by xiayx on 2021/2/3.
 */
public class CompositeTest {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                //单个模型
                new Circle(10, 10, 10, Color.BLUE),
                //组合模型
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                //组合模型
                new CompoundShape(
                        new Rectangles(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN)
//                        new Dot(240, 360, Color.GREEN),
//                        new Dot(360, 360, Color.GREEN),
//                        new Dot(360, 240, Color.GREEN),
//                        new Dot(360, 240, Color.GREEN)
                )
        );
        System.out.println("=================");
    }
}
