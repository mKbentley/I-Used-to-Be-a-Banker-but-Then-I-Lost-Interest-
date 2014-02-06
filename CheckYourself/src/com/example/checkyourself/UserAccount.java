package com.example.checkyourself;

public class UserAccount {
	private String username;
	private String password;
	private Person person;
	
	//Constructor 
    public UserAccount(String uname,String pstring,Person name){
    	this.username=uname;
    	this.password=pstring;
    	this.person=name;	
        }
    
    
    //Method for login to get the person 
    public Person getPerson(String uname,String pstring){
    	if(uname.equals(pstring)){
    		return this.person;
    	}
    	return null;
    }
    public String getUserName(){
    	return this.username;
    }
    public String getPassword(){
    	return this.password;
    }
}
