package com.application.intentputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView data = findViewById(R.id.txt_viewdata);
        Bundle bundle = getIntent().getExtras();
        String key = bundle.getString("name");
        data.setText(key);
    }
}