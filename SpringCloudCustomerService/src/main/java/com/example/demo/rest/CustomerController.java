package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;
import com.example.demo.proxy.AccountProxy;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	private CustomerService service;
	private AccountProxy proxy;
	@Autowired
	public CustomerController(CustomerService service, AccountProxy proxy) {
		super();
		this.service = service;
		this.proxy = proxy;
	}
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return service.getAllCustomer();
	}
	@RequestMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") int id)
	{
		Customer obj = service.getCustomer(id);
		
		Account account = proxy.getAccounts(id);
		obj.setAccounts(account);
		return obj;
	}
}
