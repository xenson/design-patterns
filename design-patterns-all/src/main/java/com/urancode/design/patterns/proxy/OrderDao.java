package com.urancode.design.patterns.proxy;

/**
 * Created by Enson on 2023/12/8.
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功");
        return 1;
    }
}
