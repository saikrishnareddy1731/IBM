package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductsDao;
import com.example.demo.model.Products;
@Service
public class ProductsServiceImpl implements ProductsService {

	private ProductsDao dao;
	@Autowired
	public ProductsServiceImpl(ProductsDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Products>) dao.findAll();
	}

	@Override
	public Products getproduct(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Products save(Products product) {
		// TODO Auto-generated method stub
		return dao.save(product);
}
}
