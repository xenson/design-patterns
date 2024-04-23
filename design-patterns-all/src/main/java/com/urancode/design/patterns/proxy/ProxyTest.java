package com.urancode.design.patterns.proxy;

/**
 * 代理模式
 *
 * Created by Enson on 2023/12/8.
 */
public class ProxyTest {
    public static void main(String[] args) {
        try {
            //静态代理 - 增加前后处理逻辑
            Order order = new Order();
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);

            System.out.println();

            //动态代理 - 动态使用对象方法调用
            IOrderService orderServiceDynamic = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderServiceDynamic.createOrder(order);

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
