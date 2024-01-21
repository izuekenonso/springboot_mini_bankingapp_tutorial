package com.example.bankingapp.entity;

public class Account {
	
	private Long id;
	private String accountNumber;
	private double balance;
	private Long userId;
	
	
	public Account() {

	}
	public Account(Long id, String accountNumber, double balance, Long userId) {

		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userId = userId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + ", userId=" + userId
				+ "]";
	}
	
	
}
