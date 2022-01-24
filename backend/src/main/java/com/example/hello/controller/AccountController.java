/**
 * 
 */
package com.example.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entity.Account;
import com.example.hello.service.AccountService;

/**
 * @author nguye_ig6ku5l
 *
 */
@RestController
@RequestMapping(path="api/v1/account")
public class AccountController {
	
	private final AccountService accountService;
	/**
	 * 
	 */
	@Autowired
	public AccountController(AccountService accountService) {
		// TODO Auto-generated constructor stub
		this.accountService = accountService;		
		
	}
	
	@GetMapping
 	public List<Account> getAccounts(){
  		return accountService.getAccounts();
	}	
}
