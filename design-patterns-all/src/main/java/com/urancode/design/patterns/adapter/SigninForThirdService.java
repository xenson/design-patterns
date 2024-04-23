package com.urancode.design.patterns.adapter;

/**
 * Created by Enson on 2023/12/20.
 */
public class SigninForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId) {
        //1.openId是全局唯一的，我们可以把它当作一个用户名（加长）
        //2.密码默认QQ_EMPTY
        //3.注册（在原有系统里面创建一个用户）
        //4.调用原来的登录方法
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelephone(String telephone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.login(username, null);
    }
}
