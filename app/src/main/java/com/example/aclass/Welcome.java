package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Welcome extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 8000; //This is 8 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeInten = new Intent(Welcome.this,MainActivity.class);
                startActivity(HomeInten);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
