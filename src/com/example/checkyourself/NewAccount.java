package com.example.checkyourself;

import java.util.Hashtable;

import android.view.View;

public class NewAccount 
{
	static Hashtable<Integer, Integer> accounts = new Hashtable<Integer, Integer>();
	String accountList = "\n";

	public NewAccount(String initialBalance)
	{
		accounts.put((int)accounts.size(), Integer.parseInt(initialBalance));
	}
	
	public NewAccount()
	{
		
	}
	
	public String displayAccounts()
	{
		for(int i = 0; i < accounts.size(); i++)
		{
			accountList += "Account #: " + i + "\nBalance: " + accounts.get(i) + "\n\n";
		}
		
		return accountList;
	}
}
