package com.urancode.design.patterns.adapter;

/**
 * Created by Enson on 2023/12/20.
 */
public interface IPassportForThird {
    /**
     * QQ登录
     *
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    ResultMsg loginForTelphone(String id);

    ResultMsg loginForWechat(String id);

    /**
     * 注册后自动登录
     *
     * @param username
     * @param password
     * @return
     */
    ResultMsg loginForRegist(String username, String password);
}
