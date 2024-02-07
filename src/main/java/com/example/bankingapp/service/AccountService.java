package com.example.bankingapp.service;

import com.example.bankingapp.domain.ArithmeticOperation;
import com.example.bankingapp.entity.Account;
import com.example.bankingapp.entity.Payment;

public interface AccountService {
	
	void createAccount();
	void updateAccountBalance(Payment payment, ArithmeticOperation ops);
	Account getAccountBalance(String accountNumber);
	Account findAccount(String accountNumber);
	
}
