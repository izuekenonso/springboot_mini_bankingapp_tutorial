package com.example.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankingapp.dto.PaymentDto;
import com.example.bankingapp.dto.PaymentResponseDto;
import com.example.bankingapp.entity.Account;
import com.example.bankingapp.service.PaymentServiceImpl;

@RestController
public class BankingController {
	
	@Autowired
	private PaymentServiceImpl paymentServiceImpl;
	
	@GetMapping("/health")
	public String health() {
		return "Hello there! BankingController is up and running!";
	}
	
	@PostMapping("/deposit")
	public PaymentResponseDto deposit(@RequestBody PaymentDto paymentDto) throws Exception {
		
		return paymentServiceImpl.deposit(paymentDto);
	}
	
	@PostMapping("/withdrawal")
	public PaymentResponseDto withdrawal(@RequestBody PaymentDto paymentDto) throws Exception {
		
		return paymentServiceImpl.withdrawal(paymentDto);
	}
}
