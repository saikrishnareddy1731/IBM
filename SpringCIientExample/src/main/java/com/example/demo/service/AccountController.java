package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;

@RestController
@RequestMapping("/api")
public class AccountController {

	private AccountService service;

	@Autowired
	public AccountController(AccountService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/accounts")
	public List<Account> getAllProducts()
	{
		return service.getAllAccount();
	}
	
	@GetMapping("/accountById/{id}")
	public Account getAllProducts(@PathVariable("id")int id)
	{
		return service.getAccount(id);
	}
	@GetMapping("/accountByNumber/{number}")
	public List<Account> getAllProducts(@PathVariable("number")String number)
	{
		return service.getAccountByNumber(number);
	}
	
}
