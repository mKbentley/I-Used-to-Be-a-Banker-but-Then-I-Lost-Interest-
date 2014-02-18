package com.example.checkyourself;

import java.io.IOException;

public class LoginValidation 
{
	public boolean checkCredentials(String username, String password) throws IOException
	{
        ReadUserCredentials read = new ReadUserCredentials();
        String[] credentials = read.openFile();
        
        for(int i = 0; i < credentials.length; i++)
        {
        	if(credentials[i].equals("admin, pass123"))
        	{
        		return true;
        	}
        }
        
        return false;
		
	}

	public boolean checkExistence (String username, String password) throws IOException {
        
        if(username.equals("admin") && password.equals("pass123"))
        {
        	return true;
        }
        else
        	return false;
 
    }
}
