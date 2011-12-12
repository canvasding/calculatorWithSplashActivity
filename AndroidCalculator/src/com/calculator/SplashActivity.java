package com.calculator;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.calculator.Main;

public class SplashActivity extends Activity
{
	private static final String	TAG	= "SplashActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		//Debug.startMethodTracing("mtt_browser_splash");
		Log.i(TAG, "onCreate");
		
		// 直接跳转到MainActivity
		Intent i = new Intent(this, Main.class);
		startActivity(i);
		finish();
	}
}
