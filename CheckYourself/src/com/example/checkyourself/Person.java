package com.example.checkyourself;

public class Person {
	private String fullname;
	private String accountname;
	//private double balance; These are for later 
	//private double intrestrate;
	
	private Person(String lname, String aname){
		this.fullname=lname;
		this.accountname=aname;
	}
	private void setFullName(String lname){
		this.fullname=lname;
	}
	private String getFullName(){
		return this.fullname;
	}
    
	private void setAccountname(String aname){
		this.accountname=aname;
	}
	private String getAccountname(){
		return this.accountname;
	}
}
