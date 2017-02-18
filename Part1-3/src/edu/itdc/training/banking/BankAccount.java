package edu.itdc.training.banking;

public abstract class BankAccount {
	private String accountNo;
	private String accountName;
	protected double balance;
	public BankAccount(){}
	public BankAccount(String accountNo, String accountName){
		this.accountNo = accountNo;
		this.accountName = accountName;
	}
	public BankAccount(String accountNo, String accountName, double initBalance){
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = initBalance;
	}
	
	

	public boolean deposit(double amount){return false;}
	public boolean withdraw(double amount){return false;}
	
	
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNo(){
		return accountNo;
	}
	public double getBalance(){
		return balance;
	}

}
