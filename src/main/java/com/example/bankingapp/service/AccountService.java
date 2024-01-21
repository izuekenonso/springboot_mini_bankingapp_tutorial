package com.example.bankingapp.service;

import com.example.bankingapp.entity.Account;
import com.example.bankingapp.entity.Payment;

public interface AccountService {
	
	void createAccount();
	void updateAccountBalance(Payment payment);
	Account getAccountBalance(Payment payment);
}
