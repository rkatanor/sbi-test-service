package com.sbi.service;

import com.sbi.model.Account;

public interface AccountService {
	public abstract boolean moneyTransfer(Account sbiAccount, Account iciciAccount,int amount);
	public abstract Account getSbiAccountDetails(Account account);
	public abstract Integer updateAccountDetails(String query,int amount,int accountNo);
}
