package com.orders.management.service;

import java.io.IOException;
import java.util.List;

import com.orders.management.entity.Orders;

public interface ItemCategoryService {

	List<Orders> getAll();

	Orders addOrder(Orders ord) throws IOException;

	Orders getOrderById(int order_no);

	Orders updateOrder( Orders ord);

	String deleteOrderById(int order_no);
	
	void patchOrderById(int order_no, Integer item_id, String delivery_status, String location);

}
