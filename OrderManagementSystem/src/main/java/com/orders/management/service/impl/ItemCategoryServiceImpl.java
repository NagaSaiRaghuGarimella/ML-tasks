package com.orders.management.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orders.management.entity.Orders;
import com.orders.management.repository.OrdersRepository;
import com.orders.management.repository.ItemsRepository;
import com.orders.management.service.ItemCategoryService;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

	@Autowired
	private OrdersRepository repository;
	@Autowired
	private ItemsRepository repository1;

	@Override
	public List<Orders> getAll() {

		return repository.findAll();
	}

	@Override
	public Orders addOrder(Orders ord) throws IOException {
		Optional<Orders> var = repository.findById(ord.getOrder_no());
		if (var.isPresent()) {

			throw new IOException("ORDER ALREADY EXIST");
		} else {

			return repository.save(ord);
		}

	}

	@Override
	public Orders getOrderById(int order_no) {
		return repository.findById(order_no).get();

	}

	@Override
	public Orders updateOrder(Orders ord) {

		return repository.save(ord);
	}

	@Override
	public String deleteOrderById(int order_no) {
		repository.deleteById(order_no);
		return "Deleted successfully";
	}

	@Override
	public void patchOrderById(int order_no, Integer item_id, String delivery_status, String location) {

		Orders order = repository.findById(order_no).get();
		if (item_id != null)
			order.setItems(repository1.findById(item_id).get());
		if (delivery_status != null)
			order.setDelivery_status(delivery_status);
		repository.save(order);
		if (location != null)
			order.setLocation(location);
		repository.save(order);

	}

}
