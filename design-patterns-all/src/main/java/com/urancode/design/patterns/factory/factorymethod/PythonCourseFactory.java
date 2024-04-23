package com.urancode.design.patterns.factory.factorymethod;

import com.urancode.design.patterns.factory.simplefactory.ICoures;
import com.urancode.design.patterns.factory.simplefactory.PhthonCourse;

/**
 * Created by Enson on 2023/12/7.
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICoures create() {
        return new PhthonCourse();
    }
}
