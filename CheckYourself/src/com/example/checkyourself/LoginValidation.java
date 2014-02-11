package com.example.checkyourself;

public class LoginValidation 
{
	public boolean checkCredentials(String username, String password)
	{
		if(username.equals("admin") && password.equals("pass123"))
		{
			return true;
		}
		else
			return false;
	}
}
