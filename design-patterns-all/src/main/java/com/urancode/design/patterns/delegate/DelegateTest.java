package com.urancode.design.patterns.delegate;

/**
 * 委派模式
 * <p>
 * Created by Enson on 2023/12/8.
 */
public class DelegateTest {
    public static void main(String[] args) {
        //委派 - 代理注重过滤，委派注重结果
        new Boss().command("工作A", new Leader());
        new Boss().command("工作B", new Leader());

        System.out.println();
    }
}
