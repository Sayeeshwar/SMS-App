package com.example.superapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b1 = (Button) findViewById(R.id.button1);
        final EditText e1 = (EditText) findViewById(R.id.editText1);
        final EditText e2 = (EditText) findViewById(R.id.editText2);
        
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(e1.getText().toString().equals("")|| e2.getText().toString().equals(""))
				{
					Toast.makeText(getApplicationContext(), "Enter all fields", 1000).show();
				}
				 
				else
				{
					SmsManager sms=SmsManager.getDefault(); 
					sms.sendTextMessage(e1.getText().toString(), null, e2.getText().toString(), null, null);
					Toast.makeText(getApplicationContext(), "Message sent successfully", 1000).show();
				}
				
			}
		});
    }
    
}
