package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {

	private AccountService service;

	@Autowired
	public AccountController(AccountService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/accounts")
	public List<Account> getAllAccounts()
	{
		return service.getAllAccounts();
	}
	@RequestMapping("/getAccount/{id}")
	public Account getAccount(@PathVariable("id")int id)
	{
		return service.getAccount(id);
	}
}
