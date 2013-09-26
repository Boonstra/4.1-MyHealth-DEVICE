package com.MyHealth.device;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private final String TAG = "Main Activity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void bpButtonClick(View v){
		Log.i(TAG,"To Blood Pressure");
		Intent intent = new Intent(this,BloodPresureActivity.class);
		startActivity(intent);
	}

	public void pulseButtonClick(View v){
		Log.i(TAG,"To Pulse");
		Intent intent = new Intent(this,PulseActivity.class);
		startActivity(intent);
	}
}
