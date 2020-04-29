package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
