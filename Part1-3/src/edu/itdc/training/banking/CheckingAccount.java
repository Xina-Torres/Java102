package edu.itdc.training.banking;

public class CheckingAccount extends BankAccount{
	private double overdraftProtection;
	public CheckingAccount(String accountNo, String accountName){
		super(accountNo, accountName);
	}
	
	public CheckingAccount(String accountNo, String accountName, double initBalance, double overdraftProtection){
		super(accountNo, accountName, initBalance);
		this.overdraftProtection = overdraftProtection;
	}
	
	public boolean withdraw(double amount){return false;}
}
	