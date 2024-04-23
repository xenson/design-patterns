package com.urancode.design.patterns.factory.abstractfactory;

/**
 * Created by Enson on 2023/12/7.
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
