package com.example.bankingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {
	
	@GetMapping("/health")
	public String health() {
		return "Hello there! BankingController is up and running!";
	}
}
