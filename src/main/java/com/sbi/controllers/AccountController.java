package com.sbi.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.model.Account;
import com.sbi.service.AccountService;

@RestController
@RequestMapping("api/sbi")
public class AccountController {
	@Autowired
	AccountService service;

	@RequestMapping(value = "/account/details/{accountno}", method = RequestMethod.GET)
	@ResponseBody
	public Account getSbiAccountDetails(@PathVariable("accountno") int accountNumber) {
		Account account = new Account();
		account.setAccount_no(accountNumber);
		return service.getSbiAccountDetails(account);
	}
	@RequestMapping(value = "/account/details/{amount}/{acno}", method = RequestMethod.GET)
	public Integer updateAccountDetails(@PathVariable("amount") int updated_amount ,@PathVariable("acno") int accountNo) {
		String UPDATE_SQL = "UPDATE SBI_ACCOUNT SET CUSTOMER_BALANCE=? WHERE CUSTOMER_ACCOUNT_NO=? ";     
		return service.updateAccountDetails(UPDATE_SQL, updated_amount,accountNo);

	}
	@RequestMapping(value = "/account/details/transfer/{amount}/{acno}", method = RequestMethod.GET)
	public Integer updatenewBalance(@PathVariable("amount") int updated_amount ,@PathVariable("acno") int accountNo) {
		String UPDATE_SQL = "UPDATE SBI_ACCOUNT SET CUSTOMER_BALANCE=? WHERE CUSTOMER_ACCOUNT_NO=? ";     
		return service.updateAccountDetails(UPDATE_SQL, updated_amount,accountNo);

	}
//toSBIAccount
}
