package com.orders.management.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orders.management.entity.Orders;
import com.orders.management.service.ItemCategoryService;

@RestController
public class ItemCategoryController {
	@Autowired
	private ItemCategoryService service;
	
	@GetMapping("/getAllOrders")
	public List<Orders> getAll(){
		
		return service.getAll();
		
	}
	
	@PostMapping("/addOrder")
	public Orders addOrder( @RequestBody Orders ord) throws IOException {
		
		return service.addOrder(ord);
			
	}
	
	@GetMapping("/getById/{order_no}")
	public Orders getOrderById(@PathVariable("order_no") int id){
		return service.getOrderById(id);
	}
	
	@PutMapping("/updateOrder")
	public Orders updateOrder( @RequestBody Orders ord) throws IOException {
		
		return service.addOrder(ord);
			
	}
	
	@DeleteMapping("/deleteById/{order_no}")
	public String deleteById(@PathVariable("order_no") int id){
		 return service.deleteOrderById(id);
	}
	
	@PatchMapping(path = "/patchByOrderId/{order_no}")
	public void PatchByOrderId(@PathVariable("order_no") int order_no,
			@RequestParam(name = "item_id", required = false) Integer item_id,
			@RequestParam(name = "delivery_status", required = false) String delivery_status,
			@RequestParam(name = "location", required = false) String location) {
		service.patchOrderById(order_no, item_id, delivery_status,location);
	}

}
