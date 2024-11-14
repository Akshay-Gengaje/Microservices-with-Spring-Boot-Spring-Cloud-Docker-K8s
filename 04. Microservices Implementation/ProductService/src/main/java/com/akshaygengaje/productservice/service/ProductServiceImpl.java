package com.akshaygengaje.productservice.service;

import com.akshaygengaje.productservice.entity.Product;
import com.akshaygengaje.productservice.exception.ProductServiceCustomException;
import com.akshaygengaje.productservice.model.ProductRequest;
import com.akshaygengaje.productservice.model.ProductResponse;
import com.akshaygengaje.productservice.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class ProductServiceImpl implements ProdcutService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Long addProduct(ProductRequest productRequest) {
        log.info("Adding Product...");
        Product product = Product.builder()
                .productName(productRequest.getProductName())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();
        productRepository.save(product);

        log.info("Product Created!");

        return product.getProductId();
    }

    @Override
    public ProductResponse getProductById(Long id) {
        log.info("Get the product for "+ id + " id : ");

        Product product = productRepository.findById(id).orElseThrow(() -> new ProductServiceCustomException("Product with given id Not Found!","NOT_FOUND"));
        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(product, productResponse);
        return productResponse;
    }
}
