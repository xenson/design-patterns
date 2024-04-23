package com.urancode.design.patterns.adapter;

/**
 * Created by Enson on 2023/12/20.
 */
public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
