package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;

@Repository
public interface ItemDao extends CrudRepository<Item, Integer>{

}
