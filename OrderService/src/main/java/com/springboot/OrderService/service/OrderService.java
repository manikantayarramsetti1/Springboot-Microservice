package com.springboot.OrderService.service;

import com.springboot.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
