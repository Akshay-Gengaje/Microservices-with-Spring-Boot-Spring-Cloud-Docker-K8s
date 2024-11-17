package com.akshaygengaje.orderservice.service;

import com.akshaygengaje.orderservice.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
