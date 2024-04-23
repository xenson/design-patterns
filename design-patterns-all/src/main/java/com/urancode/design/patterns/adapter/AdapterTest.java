package com.urancode.design.patterns.adapter;

/**
 * 适配器模式
 * <p>
 * Created by Enson on 2023/12/20.
 */
public class AdapterTest {
    public static void main(String[] args) {
        ResultMsg logRes;
        //V1
        SigninForThirdService service = new SigninForThirdService();
        logRes = service.loginForQQ("asdfsfdfasfsdfafsd");
        System.out.println(logRes.getMsg());

        //V2
        IPassportForThird passportForThird = new PassPortForThirdAdapter();
        logRes = passportForThird.loginForQQ("qqid");
        System.out.println(logRes.getMsg());

        System.out.println();
    }
}
