package com.orders.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orders.management.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer>{
	
	

}
