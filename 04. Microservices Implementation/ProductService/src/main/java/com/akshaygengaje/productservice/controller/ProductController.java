package com.akshaygengaje.productservice.controller;

import com.akshaygengaje.productservice.model.ProductRequest;
import com.akshaygengaje.productservice.model.ProductResponse;
import com.akshaygengaje.productservice.service.ProdcutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProdcutService prodcutService;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
        long productId = prodcutService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id){
        ProductResponse productResponse = prodcutService.getProductById(id);
        return new ResponseEntity<>(productResponse, HttpStatus.FOUND);
    }
}
