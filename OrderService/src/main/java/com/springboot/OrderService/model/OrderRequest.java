package com.springboot.OrderService.model;

public class OrderRequest {
    private long orderId;
    private long totalAmount;
    private long quantity;
    private PaymentMode paymentMode;
}
