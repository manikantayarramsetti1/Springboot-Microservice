package com.springboot.ProductService.service;

import com.springboot.ProductService.entity.Product;
import com.springboot.ProductService.model.ProductRequest;
import com.springboot.ProductService.model.ProductResponse;

public interface ProductService {
    Long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(Long productId);

}
