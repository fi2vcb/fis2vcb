/**
 * 
 */
package com.example.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entity.Customer;
import com.example.hello.service.CustomerService;

/**
 * @author nguye_ig6ku5l
 *
 */
@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
	
	private final CustomerService customerService;
	/**
	 * 
	 */
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;		
		
	}
	
	@GetMapping
 	public List<Customer> getCustomers(){
  		return customerService.getCustomers();
	}	
}
