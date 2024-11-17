package com.akshaygengaje.orderservice.repository;

import com.akshaygengaje.orderservice.entity.Order;
import com.akshaygengaje.orderservice.model.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
