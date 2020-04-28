package com.example.demo.service;

import com.example.demo.model.Products;

public interface ProductsService {

	public Iterable<Products> getAllProducts();
	public Products getproduct(int id);
	public Products save(Products product);
}
