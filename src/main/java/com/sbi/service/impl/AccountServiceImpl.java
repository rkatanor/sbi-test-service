package com.sbi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.dao.AccountDAO;
import com.sbi.model.Account;
import com.sbi.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDAO dao;
	@Override
	public boolean moneyTransfer(Account sbiAccount, Account iciciAccount, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getSbiAccountDetails(Account account) {
		// TODO Auto-generated method stub
		return dao.getAccountDetails(account);
	}

	@Override
	public Integer updateAccountDetails(String query, int amount,int accountNo) {
		// TODO Auto-generated method stub
		return dao.updateAccountData(query, amount,accountNo);
	}

}
