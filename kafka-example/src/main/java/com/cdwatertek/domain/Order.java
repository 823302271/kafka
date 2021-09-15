package com.cdwatertek.domain;

/**
 * @author zhangkaipeng
 * @date 2021/9/14 13:43
 */
public class Order {

    private Long orderId;

    private Long orderCode;

    public Order() {
    }

    public Order(long orderId,long orderCode) {
        this.orderId = orderId;
        this.orderCode = orderCode;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }
}
