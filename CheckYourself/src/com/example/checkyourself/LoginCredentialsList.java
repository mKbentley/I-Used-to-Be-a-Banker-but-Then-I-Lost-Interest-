package com.example.checkyourself;

import java.util.Hashtable;

public class LoginCredentialsList 
{
	private Hashtable<String, String> credentials = new Hashtable<String, String>();
	
	public boolean addLoginCredentials(String username, String password)
	{
		if(!credentials.containsKey(username))
		{
			credentials.put(username, password);
			return true;
		}
		else
			return false;
	}
	
	
}
