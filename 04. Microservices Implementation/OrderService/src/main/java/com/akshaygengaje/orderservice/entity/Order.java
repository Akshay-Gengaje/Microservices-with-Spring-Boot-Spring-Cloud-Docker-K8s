package com.akshaygengaje.orderservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "order_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Product_id")
    private long productId;
    @Column(name = "Quantity")
    private long quantity;
    @Column(name = "Order_Date")
    private Instant orderDate;
    @Column(name = "Order_Status")
    private String orderStatus;
    @Column(name = "Total_Amount")
    private long amount;

}
