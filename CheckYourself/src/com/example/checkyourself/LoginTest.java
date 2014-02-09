package com.example.checkyourself;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class LoginTest extends Activity {
	private static Button buttonEnter;
	private static EditText username;
	private static EditText password;
	
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_display_login_controls);
			buttonEnter=(Button)findViewById(R.id.btnEnter);
			username=(EditText)findViewById(R.id.edit_userID);
			password=(EditText)findViewById(R.id.edit_password);
			buttonEnter.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// This gets the text 
					String uInput=username.getText().toString();
					String pInput=password.getText().toString();
					boolean success=doesExist(uInput,pInput);
					
					if(success==true){
						setContentView(R.layout.activity_success);
					}
					else{
						Toast.makeText(getBaseContext(), "Sorry,password or username was incorrect.Try Again",
		            			Toast.LENGTH_SHORT).show();
					}
				}
				
			});
			
	}
	private boolean doesExist(String a, String b){
		Person adminholder=new Person();
		UserAccount admin=new UserAccount("admin","pass123",adminholder);
		if(admin.getPerson(a,b).equals(adminholder)){
		return true;
		}
		else{
			return false;
		}
	}

}
