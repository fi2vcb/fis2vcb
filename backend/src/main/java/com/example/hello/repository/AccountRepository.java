/**
 * 
 */
package com.example.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.example.hello.entity.Account;

/**
 * @author nguye_ig6ku5l
 *
 */
@Repository
public interface AccountRepository 
	extends JpaRepository<Account, Long> {		
		Optional<Account> findAccountBycif(Long cif);
}
