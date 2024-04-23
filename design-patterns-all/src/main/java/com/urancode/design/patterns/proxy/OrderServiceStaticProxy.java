package com.urancode.design.patterns.proxy;

/**
 * Created by Enson on 2023/12/8.
 */
public class OrderServiceStaticProxy implements IOrderService {
    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
        before();
        orderService.createOrder(order);
        after();

        return 0;
    }

    private void before() {
        System.out.println("Proxy before method.");
    }

    private void after() {
        System.out.println("Proxy after method.");
    }
}
