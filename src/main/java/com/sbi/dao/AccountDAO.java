package com.sbi.dao;

import com.sbi.model.Account;

public interface AccountDAO {
		public abstract boolean fundTransfer(Account sbiAccount, Account iciciAccount,int amount);
		public abstract Account getAccountDetails(Account account);
		public abstract Integer updateAccountData(String query,int amount,int accountNumber);
}
