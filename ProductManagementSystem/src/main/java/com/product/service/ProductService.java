package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product addProduct(Product prod);

	Product getProductById(Integer prouctId);

	Product updateProduct(Integer productId, Product prod);

	void deleteProductById(Integer productId);

}
