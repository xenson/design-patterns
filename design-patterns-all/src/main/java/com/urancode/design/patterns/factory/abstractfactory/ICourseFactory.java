package com.urancode.design.patterns.factory.abstractfactory;

/**
 * Created by Enson on 2023/12/7.
 */
public interface ICourseFactory {
    INote createNote();

    IVideo createVideo();
}
