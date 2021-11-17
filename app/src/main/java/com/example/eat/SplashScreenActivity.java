package com.example.eat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private final int SPLASH_SCREEN_TIMEOUT= 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        this.mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.sanji);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
                finish();
            }
        },  SPLASH_SCREEN_TIMEOUT);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mediaPlayer.start();

    }
}