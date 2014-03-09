package com.example.checkyourself;

public class AccountValidation {
	public boolean doesExist (String username) {
        
        if(username.equals("admin"))
        {
        	return true;
        }
        else
        	return false;
 
    }
	public boolean vaildSS(String ss){
		return ss.length()==9;
	}

	public boolean vaildDriver(String driver){
		return driver.length()==9;
	}

	public boolean vaildEmail(String email){
		return email.matches("[a-zA-Z][a-zA-Z0-9\\.\\-\\_]*@[a-zA-Z][a-zA-Z0-9\\.\\-\\_]*(.com|.net|.org)");
	}
}