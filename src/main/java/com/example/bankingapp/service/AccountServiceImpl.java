package com.example.bankingapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankingapp.entity.Account;
import com.example.bankingapp.entity.Payment;

@Service
public class AccountServiceImpl implements AccountService {

	private List<Account> accountList = new ArrayList<Account>();
	
	public AccountServiceImpl() {
		createAccount();
	}
	
	@Override
	public void createAccount() {
		accountList.add(new Account(1L, "202401", 49.5, 7L));
		accountList.add(new Account(2L, "202403", 0.0, 7L));
	}
	
	@Override
	public void updateAccountBalance(Payment payment) {
		Account account = accountList.stream()
									.filter(x -> x.getAccountNumber().equals(payment.getDestinationAccount()))
									.findFirst()
									.orElseThrow();
		
		double newBalance = processPayment(account, payment);
		
 		account.setBalance(newBalance);
	}

	private double processPayment(Account account, Payment payment) {
		
		double newBalance = 0.0;
		
		switch(payment.getPaymentType()) {
			case DEPOSIT: 
				newBalance = account.getBalance() + payment.getAmount();
			break;
			case WITHDRAWAL: 
				newBalance = account.getBalance() - payment.getAmount();
			break;
			case TRANSFER: 
				// do something
			break;
			default:
				newBalance = 0.0;
			break;
		}
		
		return newBalance;
		
	}

	@Override
	public Account getAccountBalance(Payment payment) {
		
		Account account = accountList.stream()
				.filter(x -> x.getAccountNumber().equals(payment.getDestinationAccount()))
				.findFirst()
				.orElseThrow();
		
		return account;
	}

}
