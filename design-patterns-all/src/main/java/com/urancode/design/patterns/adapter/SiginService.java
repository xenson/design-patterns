package com.urancode.design.patterns.adapter;

/**
 * Created by Enson on 2023/12/20.
 */
public class SiginService {
    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Object());
    }


    /**
     * 登录方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password) {
        return new ResultMsg(200, username + "：登录成功", new Object());
    }
}
