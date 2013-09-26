package com.MyHealth.device;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class BloodPresureActivity extends Activity {

	int[] bp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.blood_presure);
		bp = measureBloodPressure();
		TextView text = (TextView) findViewById(R.id.textView1);
		text.setText("Your blood pressure is "+bp[0]+"/"+bp[1]+".");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blood_presure, menu);
		return true;
	}

	private int[] measureBloodPressure(){
		Random r = new Random();
		int systolic = r.nextInt(190-80) + 80;
		int diastolic;
		if(systolic < 90){
			diastolic = (r.nextInt(60-50) + 50);
		} else if(systolic > 90 && systolic < 120){
			diastolic = (r.nextInt(80-60) + 60);
		} else if(systolic > 120 && systolic < 140){
			diastolic = (r.nextInt(90-80) + 80);
		} else if(systolic > 140 && systolic < 160){
			diastolic = (r.nextInt(100-90) + 90);
		} else if(systolic > 160 && systolic < 180){
			diastolic = (r.nextInt(110-100) + 100);
		} else {
			diastolic = (r.nextInt(120-110) + 110);
		}
		int[] bp = {systolic,diastolic};
		return bp;
	}
}
