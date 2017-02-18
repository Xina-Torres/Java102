package edu.itdc.training.banking;

public class BankAccount {
	private String accountNo;
	private String accountName;
	protected double balance;
	public BankAccount(){}
	public BankAccount(String accountNo, String accountName){
		
	}
	public BankAccount(String accountNo, String accountName, double initBalance){
		
	}
	
	public double getBalance(){return balance;}

	public boolean deposit(double amount){return false;}
	public boolean withdraw(double amount){return false;}
}
