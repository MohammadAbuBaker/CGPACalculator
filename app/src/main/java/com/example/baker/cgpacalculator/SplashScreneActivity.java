package com.example.baker.cgpacalculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreneActivity extends AppCompatActivity {

    private static int splashTimeOut=4000;//in mili second
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screne);

        actionBar=getSupportActionBar();// taken action bar
        actionBar.hide();//for hiding action bar
        new Handler().postDelayed(new Runnable() {//screne handle korbe
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreneActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },splashTimeOut);
    }
}
