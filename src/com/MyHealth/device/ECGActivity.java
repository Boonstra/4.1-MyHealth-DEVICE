package com.MyHealth.device;

import java.io.Serializable;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ECGActivity extends Activity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String leadI;
	private String leadII;
	private String leadIII;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ecg);
		leadI = generateLead();
		leadII = generateLead();
		leadIII = generateLead();
		TextView text = (TextView) findViewById(R.id.textView1);
		text.setText("Your ECG is recorded. Press send to send the data to your phone.");
	}

	private String generateLead() {
		int[] temp = new int[50];
		Random random = new Random();
		temp[0] = 0;
		temp[1] = random.nextInt(3)-1;
		for(int i=2;i<6;i++){
			temp[i] = random.nextInt(4);
		}
		for(int i=6;i<9;i++){
			temp[i] = random.nextInt(3)-1;
		}
		temp[9] = random.nextInt(3)-3;
		temp[10] = random.nextInt(5)+20;
		temp[11] = random.nextInt(4)-4;
		for(int i=12;i<16;i++){
			temp[i] = random.nextInt(3)-1;
		}
		for(int i=16;i<20;i++){
			temp[i] = random.nextInt(5);
		}
		for(int i=20;i<25;i++){
			temp[i] = random.nextInt(3)-1;
		}
		
		for(int i=0;i<25;i++){
			temp[i+25] = temp[i];
		}
		String tempStr = ""+temp[0];
		for(int i=1;i<50;i++){
			tempStr += "/"+i;
		}
		tempStr += ";";
		return tempStr;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ecg, menu);
		return true;
	}

	public String getLeadI(){
		return leadI;
	}
	public String getLeadII(){
		return leadII;
	}
	public String getLeadIII(){
		return leadIII;
	}
}
