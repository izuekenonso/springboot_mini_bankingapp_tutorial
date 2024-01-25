package com.example.bankingapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankingapp.dto.PaymentDto;
import com.example.bankingapp.entity.Account;
import com.example.bankingapp.entity.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	Logger log = LoggerFactory.getLogger(PaymentServiceImpl.class);
	
	
	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	@Override
	public Account deposit(PaymentDto paymentDto) throws Exception {
		
		isNotNegativeAmountInput(paymentDto);
		
		Payment payment = new Payment();
		payment.setAmount(paymentDto.getAmount());
		payment.setDestinationAccount(paymentDto.getDestinationAccount());
		payment.setPaymentType(paymentDto.getPaymentType());
		
		log.info("Payment Entry" + payment.toString());
		
		accountServiceImpl.updateAccountBalance(payment);
		
		return accountServiceImpl.getAccountBalance(payment);
	}

	private boolean isNotNegativeAmountInput(PaymentDto paymentDto) throws Exception {
		
		if (paymentDto.getAmount() <= 0) {
			throw new Exception("Invalid input");
		}
		
		return true;
	}

	@Override
	public Account withdrawal(PaymentDto paymentDto) throws Exception {
		
		isNotNegativeAmountInput(paymentDto);
		
		Payment payment = new Payment();
		payment.setAmount(paymentDto.getAmount());
		payment.setDestinationAccount(paymentDto.getDestinationAccount());
		payment.setPaymentType(paymentDto.getPaymentType());
		
		log.info("Payment Entry" + payment.toString());
		Account account = accountServiceImpl.getAccountBalance(payment);
		
		if ((account.getBalance() - payment.getAmount()) < 0) {
			throw new Exception("Insufficient Balance");
		}else {
			accountServiceImpl.updateAccountBalance(payment);
		}
		
		return accountServiceImpl.getAccountBalance(payment);
		
	}

	@Override
	public void tranfer() {
		// TODO Auto-generated method stub
		
	}

}
