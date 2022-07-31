package com.samsdollarsbank.model;
import com.samsdollarsbank.util.ColorsUtil;
public class Accounts {
	private String username;
	private Long accountNum;
	private String name;
	private double balance;
	
	public Accounts(String username, String name, Long accountNum, double balance) {
		super(); 
		this.username = username;
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
		
	}
	
	public Accounts(Long accountNum, double balance) {
			super();
			this.accountNum = accountNum;
			this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	public String toString() {
		return "\n" + ColorsUtil.GREEN + "********** CUSTOMER BALANCE FOR CHECKING: ***********" + ColorsUtil.RESET 
		+ "\nUsername:     \t" + username 
		+ "\nName:      \t" + name 
		+ "\nAccountNumber:     \t" + accountNum 
		+ "\nCurrentBalance:     \t" + balance
		+ "\n" ;
	}
}
