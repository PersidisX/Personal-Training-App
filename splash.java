package com.example.persidis.personaltrainingv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_splash);

        Thread startTimer = new Thread(){
          public void run(){
              try {
                  sleep(2000);
                  Intent i = new Intent(splash.this, MainActivity.class);
                  startActivity(i);
                  finish();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        startTimer.start();
    }

}
