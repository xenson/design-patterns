package com.urancode.design.patterns.proxy;

/**
 * Created by Enson on 2023/12/8.
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
