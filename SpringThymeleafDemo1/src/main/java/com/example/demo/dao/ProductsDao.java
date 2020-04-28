package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;

@Repository
public interface ProductsDao extends CrudRepository<Products, Integer>{

}
