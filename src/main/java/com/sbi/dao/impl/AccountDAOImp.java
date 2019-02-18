package com.sbi.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.sbi.dao.AccountDAO;
import com.sbi.mappers.AccountMapper;
import com.sbi.model.Account;
@Repository
public class AccountDAOImp implements AccountDAO {
	@Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public boolean fundTransfer(Account sbiAccount, Account iciciAccount, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountDetails(Account account) {
		// TODO Auto-generated method stub
		return fetchAccountDetails(account);
	}

	private Account fetchAccountDetails(Account account) {
		// TODO Auto-generated method stub
	       
				String sql="SELECT * FROM SBI_ACCOUNT WHERE CUSTOMER_ACCOUNT_NO="+account.getAccount_no()+"";
				Account sbiAccountObject = jdbctemplate.queryForObject(sql, new AccountMapper());
				System.out.println("data from SBI db :" +sbiAccountObject);
				return sbiAccountObject;
	}

	@Override
	public Integer updateAccountData(String query, int updatedamount, int accountNumber) {
		// TODO Auto-generated method stub
		
		return jdbctemplate.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, updatedamount);
				ps.setInt(2, accountNumber);
			}
		});

	}

}
