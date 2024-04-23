package com.urancode.design.patterns.factory.abstractfactory;

/**
 * Created by Enson on 2023/12/7.
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
