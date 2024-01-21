package com.example.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankingapp.dto.PaymentDto;
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
	public Account deposit(@RequestBody PaymentDto paymentDto) {
		
		return paymentServiceImpl.deposit(paymentDto);
	}
}
