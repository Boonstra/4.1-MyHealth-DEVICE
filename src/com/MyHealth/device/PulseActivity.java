package com.MyHealth.device;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class PulseActivity extends Activity {

	int pulse;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pulse);
		pulse = measurePulse();
		TextView text = (TextView) findViewById(R.id.textView1);
		text.setText("Your pulse is "+pulse+"bpm.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pulse, menu);
		return true;
	}

	private int measurePulse(){
		Random r = new Random();
		int pulse = (r.nextInt(140-40)+40);
		return pulse;
	}
	
}
