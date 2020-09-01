package com.application.tugaslatihanintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ContentActivity extends AppCompatActivity {
    Button btnToWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Toolbar tool = findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getSupportActionBar() != null){
            getSupportActionBar().setElevation(20);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        btnToWebsite = findViewById(R.id.btn_toOfficialWeb);
        btnToWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.maternaldisaster.com"));
                startActivity(toWeb);
            }
        });
    }
}