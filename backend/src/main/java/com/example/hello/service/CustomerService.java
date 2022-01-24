/**
 * 
 */
package com.example.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.entity.Customer;
import com.example.hello.repository.CustomerRepository;

/**
 * @author nguye_ig6ku5l
 *
 */
@Service
public class CustomerService {
	
	private final CustomerRepository customerRepository;

	/**
	 * 
	 */
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		// TODO Auto-generated constructor stub
		this.customerRepository = customerRepository;		
	}
	
    public List<Customer> getCustomers(){
    	return customerRepository.findAll();
    }
	
}
