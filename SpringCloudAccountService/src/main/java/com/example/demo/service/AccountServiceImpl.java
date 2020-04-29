package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountDao dao;
	@Autowired
	public AccountServiceImpl(AccountDao dao)
	{
		super();
		this.dao = dao;
	}

	@Override
	public List<Account> getAllAccounts() 
	{
		// TODO Auto-generated method stub
		return (List<Account>) dao.findAll(); 
	}

	@Override
	public Account getAccount(int id) 
	{
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

}
