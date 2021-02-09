package com.example.mysqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    TextView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splash = findViewById(R.id.textsplash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splash.setVisibility(View.VISIBLE);
                splash.animate().alpha(1.0f).setDuration(500);
            }
        }, 500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toMain = new Intent(Splash.this, MainActivity.class);
                startActivity(toMain);
            }
        }, 1700);
    }
}