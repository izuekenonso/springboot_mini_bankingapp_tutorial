package com.example.bankingapp.service;

import com.example.bankingapp.dto.PaymentDto;
import com.example.bankingapp.dto.PaymentResponseDto;

public interface PaymentService {
	
	PaymentResponseDto deposit(PaymentDto paymentDto) throws Exception;
	PaymentResponseDto withdrawal(PaymentDto paymentDto) throws Exception;
	PaymentResponseDto transfer(PaymentDto paymentDto) throws Exception;
	
}
