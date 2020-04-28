package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.AccountDAO;
import com.example.demo.data.Account;
import com.example.demo.dto.AccountDto;

@Service
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;

	// Constructor Injection
	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	@Override
	@Transactional
	public ResponseEntity<List<AccountDto>> getAccounts() {
		Iterable<Account> accounts = accountDAO.findAll();
		List<AccountDto> accountDTO = new ArrayList<AccountDto>();
		for (Account a : accounts) {
			/*
			 * accountDTO.add(new AccountDto(a.getAccountID(), a.getAccountType(),
			 * a.getBalance()));
			 */
			
			accountDTO.add(new AccountDto(a.getAccountType(), a.getBalance()));
		}
		return ResponseEntity.ok().body(accountDTO);
	}

	@Override
	public ResponseEntity<AccountDto> findAccountById(int id) {
		if (accountDAO.findById(id).isPresent()) {
			Account account = accountDAO.findById(id).get();
			AccountDto accountDTO = new AccountDto(account.getAccountType(), account.getBalance());
		
			return ResponseEntity.ok().body(accountDTO);
		} else
			return null;
	}

	@Override
	public ResponseEntity<AccountDto> save(AccountDto accountDto) {

		Account account = new Account(UUID.randomUUID().toString(), accountDto.getAccountType(),
				accountDto.getAccountBalance());
		accountDAO.save(account);
		return ResponseEntity.ok().body(accountDto);
	}

	@Override
	public ResponseEntity<AccountDto> deleteAccount(int id) {
		if (accountDAO.findById(id).isPresent()) {
			Account account = accountDAO.findById(id).get();
			
			AccountDto accountDto = new AccountDto(account.getAccountType(), account.getBalance());
			accountDAO.deleteById(id);
		
			return ResponseEntity.ok().body(accountDto);
		} else
			return null;
	}

	@Override
	public ResponseEntity<Account> updateAccont(Account account) {
		if (accountDAO.findById(account.getAccountNumber()).isPresent()) {
			accountDAO.save(account);
			return ResponseEntity.ok().body(account);
		} else
			return null;

	}

	
	@Override
	public ResponseEntity<Iterable<Account>> findByAccountType(String accountType) {
		Iterable<Account> accounts = accountDAO.findByAccountType(accountType);
		return ResponseEntity.ok().body(accounts);
	}

	
	@Override
	public ResponseEntity<Iterable<Account>> findByAccountTypeAndBalance(String accountType, double balance) {
		Iterable<Account> accounts = accountDAO.findByAccountTypeAndBalance(accountType, balance);
		return ResponseEntity.ok().body(accounts);
	}

	@Override
	@Transactional
	public void removeByAccountType(String accountType) {
		accountDAO.deleteByAccountType(accountType);
		
	}

}