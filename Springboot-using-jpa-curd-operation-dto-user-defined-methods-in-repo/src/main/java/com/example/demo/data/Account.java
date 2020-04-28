package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_number")
	private int accountNumber;

	
	@Column(name = "account_ID", nullable = false)
	private String accountID;

	
	@Column(name = "account_type")
	private String accountType;

	
	@Column(name = "account_balance")
	private double balance;

	public Account() {
	}

	public Account(String accountID, String accountType, double balance) {
		super();
		this.accountID = accountID;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountID() {
		return accountID;
	}



	public String getAccountType() {
		return accountType;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountID=" + accountID + ", accountType=" + accountType
				+ ", balance=" + balance + "]";
	}

}