/**
 * 
 */
package com.example.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.entity.Account;
import com.example.hello.repository.AccountRepository;

/**
 * @author nguye_ig6ku5l
 *
 */
@Service
public class AccountService {
	
	private final AccountRepository accountRepository;

	/**
	 * 
	 */
	@Autowired
	public AccountService(AccountRepository accountRepository) {
		// TODO Auto-generated constructor stub
		this.accountRepository = accountRepository;		
	}
	
    public List<Account> getAccounts(){
    	return accountRepository.findAll();
    }
	
}
