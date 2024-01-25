package com.example.bankingapp.service;

import com.example.bankingapp.dto.PaymentDto;
import com.example.bankingapp.entity.Account;

public interface PaymentService {
	
	Account deposit(PaymentDto paymentDto) throws Exception;
	Account withdrawal(PaymentDto paymentDto) throws Exception;
	void tranfer();
	
}
