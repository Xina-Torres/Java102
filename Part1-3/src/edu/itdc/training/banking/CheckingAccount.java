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
	// balance - amount
	// 
	public boolean withdraw(double amount){
		//;
		if(super.balance >= amount || super.balance -amount <= overdraftProtection){
			return true;
		}
		else{
			return false;
		}
	}
}
	