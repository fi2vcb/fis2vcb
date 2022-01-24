/**
 * 
 */
package com.example.hello.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nguye_ig6ku5l
 *
 */
@Entity
@Table(name="account")
public class Customer {

	/**
	 * 
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private Long sid;
    public Customer(String name, Long sid) {
        Name = name;
        this.sid = sid;
    }
    public Long getId() {
        return id;
    }    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Long getSid() {
        return sid;
    }
    public void setSid(Long sid) {
        this.sid = sid;
    }
    @Override
    public String toString() {
        return "Customer [sid=" + sid + "/Name=" + Name + "]";
    }    

}
