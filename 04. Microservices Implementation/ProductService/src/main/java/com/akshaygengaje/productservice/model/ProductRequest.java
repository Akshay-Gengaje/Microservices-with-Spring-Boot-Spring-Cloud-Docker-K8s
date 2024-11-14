package com.akshaygengaje.productservice.model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductRequest {
    private String productName;
    private long price;
    private long quantity;
}
