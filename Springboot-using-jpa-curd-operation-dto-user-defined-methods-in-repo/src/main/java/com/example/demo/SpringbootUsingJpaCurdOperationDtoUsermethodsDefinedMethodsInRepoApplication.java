package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.AccountDAO;
import com.example.demo.service.AccountService;

import com.example.demo.data.Account;

@SpringBootApplication
public class SpringbootUsingJpaCurdOperationDtoUsermethodsDefinedMethodsInRepoApplication implements CommandLineRunner {

	private AccountService accountService;
	private AccountDAO accountDAO;

	@Autowired
	public SpringbootUsingJpaCurdOperationDtoUsermethodsDefinedMethodsInRepoApplication(AccountService accountService, AccountDAO accountDAO) {
		super();
		this.accountService = accountService;
		this.accountDAO = accountDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUsingJpaCurdOperationDtoUsermethodsDefinedMethodsInRepoApplication.class, args);
	}

	
	
	// in this project i have inserted in 2 ways.
		//1.CommandLineRunner
		//2.data.sql  here we should write query in this only

		@Override
		public void run(String... args) throws Exception {
			accountDAO.save(new Account(UUID.randomUUID().toString(), "Saving", 10000));
			accountDAO.save(new Account(UUID.randomUUID().toString(), "Current", 50000));
			System.out.println(accountService.getAccounts().toString());

		}

}
