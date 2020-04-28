package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Model for Account")
public class AccountDto {

	/*
	 * @ApiModelProperty(notes = "field for Consumer Number") private String
	 * accountID;
	 */
	
	@ApiModelProperty(notes = "Field for account type")
	private String accountType;
	
	@ApiModelProperty(notes = "Field for balance of the account")
	private double accountBalance;

	
	
	/*
	 * public AccountDto(String accountID, String accountType, double
	 * accountBalance) { super(); this.accountID = accountID; this.accountType =
	 * accountType; this.accountBalance = accountBalance; }
	 */
	/*
	 * public String getAccountID() { return accountID; }
	 */

	public String getAccountType() {
		return accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	/*
	 * public void setAccountID(String accountID) { this.accountID = accountID; }
	 */

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountDto(String accountType, double accountBalance) {
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "AccountDto [accountType=" + accountType + ", accountBalance=" + accountBalance + "]";
	}

	
}