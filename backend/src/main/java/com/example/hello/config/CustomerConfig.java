/**
 * 
 */
package com.example.hello.config;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hello.entity.Customer;
import com.example.hello.repository.CustomerRepository;
/**
 * @author nguye_ig6ku5l
 *
 */
@Configuration
public class CustomerConfig {

	/**
	 * 
	 */
	@Bean
    CommandLineRunner commandLineRunner1(CustomerRepository repository){
        return args -> {
            Customer cif1 = new Customer("cif1", 013532311L);
            Customer cif2 = new Customer("cif2", 013532311L);
            Customer cif3 = new Customer("cif3", 013532311L);
            Customer cif4 = new Customer("cif4", 013532311L);
            Customer cif5 = new Customer("cif5", 013532311L);
            Customer cif6 = new Customer("cif6", 013532311L);
            repository.saveAll(List.of(cif1,cif2,cif3,cif4,cif5,cif6));
        };
    }   

}
