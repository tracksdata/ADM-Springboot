package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	// save product
	Product save(Product product);

	// list all products
	List<Product> findAll();

	// find by id
	Product findById(int id);

	// Finding all Products By Name
	List<Product> findProductsByName(String name);

	// Delete Product
	void delete(int id);

	// update product
	Product update(Product product);

}