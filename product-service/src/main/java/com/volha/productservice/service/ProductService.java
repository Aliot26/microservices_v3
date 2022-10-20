package com.volha.productservice.service;

import com.volha.productservice.dto.ProductRequest;
import com.volha.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
