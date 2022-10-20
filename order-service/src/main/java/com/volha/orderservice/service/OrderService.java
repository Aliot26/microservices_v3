package com.volha.orderservice.service;

import com.volha.orderservice.dto.OrderRequest;

public interface OrderService {
    public void placeOrder(OrderRequest orderRequest);
}
