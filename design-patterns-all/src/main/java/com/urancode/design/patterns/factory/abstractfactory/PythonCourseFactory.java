package com.urancode.design.patterns.factory.abstractfactory;

/**
 * Created by Enson on 2023/12/7.
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
