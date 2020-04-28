package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Account;
import com.example.demo.dto.AccountDto;
import com.example.demo.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1")
@Api(value = "Account management system",description = "Operations pertaining to Account in Account Management System")
public class AccountRestController {

	private AccountService accountService;

	@Autowired
	public AccountRestController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@ApiOperation(value = "View a list of available accounts", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/accounts")
	public ResponseEntity<List<AccountDto>> getAccounts() {
		return accountService.getAccounts();
	}

	@ApiOperation("find an account by id")
	@GetMapping("/accounts/{accountID}")
	public ResponseEntity<AccountDto> findAccountById(@PathVariable int accountID) {
		return accountService.findAccountById(accountID);
	}

	@ApiOperation("Save an account in the system")
	@PostMapping("/accounts")
	public ResponseEntity<AccountDto> saveAccount(@RequestBody AccountDto accountDto) {
		return accountService.save(accountDto);
	}
	
	@ApiOperation("Delete an account by Id")
	@DeleteMapping("/accounts/{accountID}")
	public ResponseEntity<AccountDto> deleteaccount(@PathVariable int accountID){
		return accountService.deleteAccount(accountID);
	}

	@ApiOperation("update an account")
	@PutMapping("/accounts")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account){
		return accountService.updateAccont(account);
	}
	
	@ApiOperation("Find account by its type")
	@GetMapping("/accounts/get/{accountType}")
	public ResponseEntity<Iterable<Account>> findAccountByType(@PathVariable String accountType){
		return accountService.findByAccountType(accountType);
	}
	
	@ApiOperation("Find account by its type and balance")
	@GetMapping("/accounts/get/{accountType}/{Balance}")
	public ResponseEntity<Iterable<Account>> findAccountByTypeAndBalance(@PathVariable String accountType,@PathVariable double Balance){
		return accountService.findByAccountTypeAndBalance(accountType, Balance);
	}
	@ApiOperation("Delete an account by Account type")
	@DeleteMapping("/accounts/delete/{accountType}")
	public void deleteaccount(@PathVariable String accountType){
		 accountService.removeByAccountType(accountType);
	}
}