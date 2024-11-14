package com.akshaygengaje.productservice.service;

import com.akshaygengaje.productservice.model.ProductRequest;
import com.akshaygengaje.productservice.model.ProductResponse;

public interface ProdcutService {
    Long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(Long id);
}
