package com.atguigu.srping5;

/**
 * @ClassName Order
 * @Description 有参注入属性
 * @Author 12468
 * @Date 2021/12/12 21:01
 * @Version 1.0
 */
public class Order {
    private String orderName;
    private String address;

    public Order(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    public void getOrderDetail() {
        System.out.println(orderName + ":" + address);
    }
}
