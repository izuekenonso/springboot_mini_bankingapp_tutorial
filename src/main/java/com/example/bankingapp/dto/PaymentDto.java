package com.example.bankingapp.dto;

import com.example.bankingapp.domain.PaymentType;

public class PaymentDto {
	private Long id;
	private double amount;
	private String sourceAccount;
	private String destinationAccount;
	private PaymentType paymentType;
	
	
	public PaymentDto() {
		
	}

	public PaymentDto(Long id, double amount, String sourceAccount, String destinationAccount, PaymentType paymentType) {

		this.id = id;
		this.amount = amount;
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
		this.paymentType = paymentType;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public String getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(String destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "PaymentDto [id=" + id + ", amount=" + amount + ", sourceAccount=" + sourceAccount
				+ ", destinationAccount=" + destinationAccount + ", paymentType=" + paymentType + "]";
	}
}
