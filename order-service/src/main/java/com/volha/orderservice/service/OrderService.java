package com.volha.orderservice.service;

import com.volha.orderservice.dto.OrderRequest;

public interface OrderService {
    public String placeOrder(OrderRequest orderRequest);
}
