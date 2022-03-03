package com.orders.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orders.management.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {




}
