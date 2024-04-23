package com.urancode.design.patterns.adapter;

/**
 * Created by Enson on 2023/12/20.
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(200, id + "：QQ用户登录成功", new Object());
    }
}
