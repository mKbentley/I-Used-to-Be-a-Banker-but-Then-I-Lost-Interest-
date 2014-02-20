package com.example.checkyourself;

public class NewUser 
{
	static String username;
	static String password;
	static String firstName;
	static String lastName;
	
	public NewUser(String username, String password, String firstName, String lastName)
	{
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
}
