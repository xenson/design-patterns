package com.urancode.design.patterns.factory.factorymethod;

import com.urancode.design.patterns.factory.simplefactory.ICoures;
import com.urancode.design.patterns.factory.simplefactory.JavaCourse;

/**
 * Created by Enson on 2023/12/7.
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICoures create() {
        return new JavaCourse();
    }
}
