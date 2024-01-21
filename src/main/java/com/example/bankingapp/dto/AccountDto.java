package com.example.bankingapp.dto;

public class AccountDto {
	private Long id;
	private String accountNumber;
	private String balance;
	private Long userId;
	
	
	public AccountDto() {

	}
	
	public AccountDto(Long id, String accountNumber, String balance, Long userId) {
		
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
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
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
		return "AccountDto [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + ", userId=" + userId
				+ "]";
	}
	
}
