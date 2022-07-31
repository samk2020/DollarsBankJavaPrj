package com.samsdollarsbank.model;
import com.samsdollarsbank.util.ColorsUtil;

public class CustomerInfo {
	private String name;
	private String username; 
	private String password;  
	private Long accountNum; 
	private Long ssn;
	
	public CustomerInfo(String name, String username, String password, Long accountNum, Long ssn){ 
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.accountNum = accountNum; 
		this.ssn = ssn;
	} 
	
	public String getName() {
		return name;
	} 
	
	public void setName(String name) {
		this.name = name; 
	} 
	
	public String getUsername() {
		return username;
	} 
	
	public void setUserName(String username) {
		this.username = username; 
	}  
	
	public String getPassword() {
		return password;
	}  
	
	public void setPassword(String password) {
		this.password = password; 
	} 
	
	public Long getAccountNum() {
		return accountNum;
		
	}
	
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	} 
	
	public Long getSsn() {
		return ssn;
	} 
	
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	} 
	
	@Override 
	public String toString() {
			return "\n" + ColorsUtil.BLUE + "********** CUSTOMER BANKING DETAILS: **********" + ColorsUtil.RESET 
					+ "\nUsername:     \t" + username 
					+ "\nName:      \t" + name 
					+ "\nPassword:     \t" + password 
					+ "\nAccountNumber:     \t" + accountNum 
					+ "\nSocialSecurityNumber:     \t" + ssn 
					+ "\n" ;
					
	}		
}
