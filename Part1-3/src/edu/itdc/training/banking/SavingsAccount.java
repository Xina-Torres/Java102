package edu.itdc.training.banking;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(String accountNo, String accountName){
		super(accountNo, accountName);
	}
	
	public SavingsAccount(String accountNo, String accountName, double initBalance, double interestRate){
		super(accountNo, accountName, initBalance);
		this.interestRate = interestRate;
	}
	
	public String toString(){
		return "[ " + this.getAccountNo() + " , " + this.getAccountName() + " , " + this.getBalance() + " , " + 
				interestRate + " ]";
	}
}
