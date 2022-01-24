package com.example.hello.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	@Column(name="cif")
	private Long cif;
	@Column(name="balance")
	private Float balance;
	@Column(name="dob")
	private LocalDate dob;
	public Account() {
		super();
	}
	/**
	 * @param cif
	 * @param balance
	 * @param dob
	 */
	public Account(Long cif, Float balance, LocalDate dob) {
		this.cif = cif;
		this.balance = balance;
		this.dob = dob;
	}
	public Long getId() {
		return id;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Long getCif() {
		return cif;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", cif=" + cif + ", balance=" + balance + ", dob=" + dob + "]";
	}
	
	
}
