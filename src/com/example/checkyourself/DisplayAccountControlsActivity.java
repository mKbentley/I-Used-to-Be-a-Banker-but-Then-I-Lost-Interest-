package com.example.checkyourself;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayAccountControlsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_account_controls);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// Called when the user clicks the Login button
	public void sendAccountResgistration(View view) {
		Intent intent = new Intent(this,
				DisplayAccountRegistrationControlsActivity.class);
		startActivity(intent);

	}

	// Called when the user clicks the View Current Accounts button
	public void viewAccounts(View view) {
		TextView textView = new TextView(this);

		NewAccount account = new NewAccount();
		textView.setText("Your accounts:\n" + account.displayAccounts());

		setContentView(textView);
	}

	public void sendAccounts(View view) 
	{
		if(NewAccount.accounts.size() > 0)
		{
			Intent intent = new Intent(this, DisplayAccountOptionsActivity.class);
			startActivity(intent);
		}
		else
		{
			TextView textView = new TextView(this);
		    textView.setTextSize(15);
		    textView.setText("Sorry, you don't have any accounts currently set up. Please create an account and try again.");
		    
		    setContentView(textView);
		    
			Intent intent = new Intent(this, DisplayAccountControlsActivity.class);
			startActivity(intent);
		}
	}

}