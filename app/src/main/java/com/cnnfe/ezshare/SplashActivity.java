package com.cnnfe.ezshare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.cnnfe.ezshare.R;

public class SplashActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Your Code
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                //finish();
            }
        }, 3000);
    }



}