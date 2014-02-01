package com.example.paypal_hackathon;

import android.app.Activity;
import android.os.Bundle;
import android.bluetooth.*;
import android.content.*;



public class blutooth_service extends Activity{
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
		 BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		 mBluetoothAdapter.startDiscovery(); 
			BroadcastReceiver mReceiver = new BroadcastReceiver() {
			public void onReceive(Context context, Intent intent) {
			    String action = intent.getAction();
			}
			};
			
			
	 }
	 
	 }
	
	
	


