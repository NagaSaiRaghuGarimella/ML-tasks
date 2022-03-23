package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@CrossOrigin
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@CrossOrigin
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product prod) {

		return service.addProduct(prod);

	}

	@CrossOrigin
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") Integer productId) {
		return service.getProductById(productId);
	}

	@CrossOrigin
	@PutMapping("/products/{id}")

	public ResponseEntity<Product> updateProduct(@PathVariable("id") Integer productId, @RequestBody Product prod) {

		return new ResponseEntity<Product>(service.updateProduct(productId, prod), HttpStatus.OK);

	}

	@CrossOrigin
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Integer> deleteProductById(@PathVariable("id") Integer productId) {

		service.deleteProductById(productId);

		return new ResponseEntity<>(productId, HttpStatus.OK);

	}

}
