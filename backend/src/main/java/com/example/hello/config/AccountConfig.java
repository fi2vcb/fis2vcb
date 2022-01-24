/**
 * 
 */
package com.example.hello.config;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hello.entity.Account;
import com.example.hello.repository.AccountRepository;
/**
 * @author nguye_ig6ku5l
 *
 */
@Configuration
public class AccountConfig {

	/**
	 * 
	 */
	@Bean
    CommandLineRunner commandLineRunner(AccountRepository repository){
        return args -> {
            Account cif1 = new Account(1L, 0f, LocalDate.of(2020,Month.JANUARY,01));
            Account cif2 = new Account(2L, 0f, LocalDate.of(2020,Month.JANUARY,02));
            Account cif3 = new Account(3L, 0f, LocalDate.of(2020,Month.JANUARY,03));
            Account cif4 = new Account(4L, 0f, LocalDate.of(2020,Month.JANUARY,04));
            Account cif5 = new Account(5L, 0f, LocalDate.of(2020,Month.JANUARY,05));
            Account cif6 = new Account(6L, 0f, LocalDate.of(2020,Month.JANUARY,06));
            repository.saveAll(List.of(cif1,cif2,cif3,cif4,cif5,cif6));
        };
    }   

}
