package com.example.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import com.example.scanner.R;

public class MainActivity1 extends Activity {
String SDCARD=Environment.getExternalStorageDirectory().getPath();
TextView txtPermission;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

			}
	
	
	
	public void login(View v){
		Intent i = new Intent(getBaseContext(), LoginActivity.class);
		startActivity(i);
	}
	
    
    
	public void createAccount(View v){
		Intent i = new Intent(getBaseContext(), Registeration.class);
		 i.putExtra("usertype", "user");
		startActivity(i);
	}


}
