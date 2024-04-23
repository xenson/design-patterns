package com.urancode.design.patterns.adapter;

/**
 * Created by Enson on 2023/12/20.
 */
public class LoginForTelAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
