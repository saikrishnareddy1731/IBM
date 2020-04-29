package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerDao dao;

	@Autowired
	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) dao.findAll();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}
	
	
	
}
