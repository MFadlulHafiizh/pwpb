package com.application.mypwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnLinear;
    Button btnRelative;
    Button btnFrame1;
    Button btnFrame2;
    Button btnTableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnFrame1 = findViewById(R.id.btn_frameLayout1);
        btnFrame2 = findViewById(R.id.btn_frameLayout2);
        btnTableLayout = findViewById(R.id.btn_tablelayout);

        btnLinear.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnFrame1.setOnClickListener(this);
        btnFrame2.setOnClickListener(this);
        btnTableLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_linear:
                Intent keLinear = new Intent(MainActivity.this, LatihanLinear.class);
                startActivity(keLinear);
                break;

            case R.id.btn_relative:
                Intent keRelative = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(keRelative);
                break;

            case R.id.btn_frameLayout1:
                Intent keFrameLayout1 = new Intent(MainActivity.this, FrameLayout1.class);
                startActivity(keFrameLayout1);
                break;

            case R.id.btn_frameLayout2:
                Intent keFrameLayout2 = new Intent(MainActivity.this, FrameLayout2.class);
                startActivity(keFrameLayout2);
                break;

            case R.id.btn_tablelayout:
                Intent keTableLayout = new Intent(MainActivity.this, TableLayout.class);
                startActivity(keTableLayout);
                break;

        }
    }
}