/**
 * 
 */
package com.example.hello.entity;

import javax.persistence.Column;
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
@Table(name="customer")
public class Customer {

	/**
	 * 
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="name")
    private String name;
	@Column(name="isi")
    private Long sid;
	
    /**
	 * 
	 */
	public Customer() {
	}
	public Customer(String name, Long sid) {
        this.name = name;
        this.sid = sid;
    }
    public Long getId() {
        return id;
    }    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getSid() {
        return sid;
    }
    public void setSid(Long sid) {
        this.sid = sid;
    }
    @Override
    public String toString() {
        return "Customer [sid=" + sid + "/name=" + name + "]";
    }    

}
