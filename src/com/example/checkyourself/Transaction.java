package com.example.checkyourself;

public class Transaction 
{
	static int accountNumber;
	
	public Transaction(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public Transaction()
	{
		
	}
	
	public void deposit(int amount)
	{
		NewAccount.accounts.put(accountNumber, NewAccount.accounts.get(accountNumber) + amount);
		
	}
	
	public void withdraw(int amount)
	{
		NewAccount.accounts.put(accountNumber, NewAccount.accounts.get(accountNumber) - amount);
	}
}
