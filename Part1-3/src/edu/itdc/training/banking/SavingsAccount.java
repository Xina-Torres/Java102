package edu.itdc.training.banking;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(String accountNo, String accountName){
		super(accountNo, accountName);
	}
	
	public SavingsAccount(String accountNo, String accountName, double initBalance, double interestRate){
		
	}
}
