/**
 * 
 */
package com.example.hello.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entity.Account;
import com.example.hello.service.AccountService;

/**
 * @author nguye_ig6ku5l
 *
 */
@RestController
@RequestMapping(path="api/v1")
public class AccountController {
	
	private final AccountService accountService;
	/**
	 * 
	 */
	//@Autowired
	public AccountController(AccountService accountService) {
		// TODO Auto-generated constructor stub
		this.accountService = accountService;		
		
	}
	
	@GetMapping("/QueryAccount/{cif}")
 	public ResponseEntity<Account> getAccountBycif(@PathVariable("cif") Long cif){
		Account account = accountService.findAccountBycif(cif);
  		return new ResponseEntity<>(account, HttpStatus.OK);
	}	

	// @GetMapping("/QueryAccount/{cif}")
	// @ResponseBody
	// public String getEmployeesById(@PathVariable String cif) {
	// 	return "ID: " + cif;
	// }
}
