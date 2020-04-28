package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Account;

@Repository(value = "accountDAO")
//Interface for providing the crud operation using the crudRepository
public interface AccountDAO extends CrudRepository<Account, Integer> {
	
	//if u want to declare some methods manually ,we declare here because curdRepo have find by primarykey only .
	//if u want to find name we can declare here
	@Query
	public Iterable<Account> findByAccountType(String accountType);

	public Iterable<Account> findByAccountTypeAndBalance(String accountType, double balance);

	public void deleteByAccountType(String accountType);

}
