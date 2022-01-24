/**
 * 
 */
package com.example.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hello.entity.Account;

/**
 * @author nguye_ig6ku5l
 *
 */
@Repository
public interface AccountRepository 
	extends JpaRepository<Account, Long> {		
}
