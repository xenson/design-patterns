package com.urancode.design.patterns.others.visitor;

import com.urancode.design.patterns.others.visitor.shapes.Circle;
import com.urancode.design.patterns.others.visitor.shapes.CompoundShape;
import com.urancode.design.patterns.others.visitor.shapes.Dot;
import com.urancode.design.patterns.others.visitor.shapes.Rectangles;

/**
 * 通用访问者接口
 * Created by xiayx on 2021/2/3.
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangles rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
