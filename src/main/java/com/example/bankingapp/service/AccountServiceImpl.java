package com.example.bankingapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankingapp.domain.ArithmeticOperation;
import com.example.bankingapp.entity.Account;
import com.example.bankingapp.entity.Payment;

@Service
public class AccountServiceImpl implements AccountService {
	
	private Account account;
	
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
	public void updateAccountBalance(Payment payment, ArithmeticOperation ops) {

		double newBalance = processPayment(payment, ops);
		
 		account.setBalance(newBalance);
	}

	private double processPayment(Payment payment,  ArithmeticOperation ops) {
		
		double newBalance = 0.0;
		
		switch(payment.getPaymentType()) {
			case DEPOSIT: 			
				newBalance = creditOps(payment);
			break;
			case WITHDRAWAL: 
				newBalance = debitOps(payment);
			break;
			case TRANSFER: 
				if(ops == ArithmeticOperation.CREDIT) newBalance = creditOps(payment);
				if(ops == ArithmeticOperation.DEBIT) newBalance = debitOps(payment);
			break;
			default:
				newBalance = 0.0;
			break;
		}
		
		return newBalance;
		
	}

	private double debitOps(Payment payment) {
		account = findAccount(payment.getDebitAccount());
		return account.getBalance() - payment.getAmount();
	}

	private double creditOps(Payment payment) {
		account = findAccount(payment.getCreditAccount());
		return account.getBalance() + payment.getAmount();
	}

	@Override
	public Account getAccountBalance(String accountNumber) {
		
		account = findAccount(accountNumber);
		
		return account;
	}

	@Override
	public Account findAccount(String accountNumber) {
		
		Account account = accountList.stream()
				.filter(x -> x.getAccountNumber().equals(accountNumber))
				.findFirst()
				.orElseThrow();
		
		return account;
	}

}
