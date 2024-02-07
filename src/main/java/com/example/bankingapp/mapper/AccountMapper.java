package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.AccountDto;
import com.example.bankingapp.entity.Account;

public class AccountMapper {
	
	public static Account dtoToAccount(AccountDto accountDto) {
		
		Account account = new Account();
		
		account.setId(accountDto.getId());
		account.setAccountNumber(accountDto.getAccountNumber());
		account.setBalance(accountDto.getBalance());
		account.setUserId(accountDto.getUserId());
		
		return account;
	}
	
	public static AccountDto accountToDto(Account account) {
		
		AccountDto accountDto = new AccountDto();
		
		accountDto.setId(account.getId());
		accountDto.setAccountNumber(account.getAccountNumber());
		accountDto.setBalance(account.getBalance());
		accountDto.setUserId(account.getUserId());
		
		return accountDto;
	}
}
