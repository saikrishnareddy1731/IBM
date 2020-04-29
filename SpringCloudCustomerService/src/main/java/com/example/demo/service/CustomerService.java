package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();
	public Customer getCustomer(int id);
}
