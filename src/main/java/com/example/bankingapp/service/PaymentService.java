package com.example.bankingapp.service;

import com.example.bankingapp.dto.PaymentDto;
import com.example.bankingapp.entity.Account;

public interface PaymentService {
	
	Account deposit(PaymentDto paymentDto);
	void withdrawal();
	void tranfer();
}
