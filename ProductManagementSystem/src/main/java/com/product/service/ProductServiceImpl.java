package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> getAllProducts() {

		return repo.findAll();
	}

	@Override
	public Product addProduct(Product prod) {
		return repo.save(prod);
	}

	@Override
	public Product getProductById(Integer prouctId) {

		return repo.findById(prouctId).get();
	}

	@Override
	public Product updateProduct(Integer productId, Product prod) {

		return repo.save(prod);
	}

	@Override
	public void deleteProductById(Integer productId) {

		repo.deleteById(productId);

	}

}
