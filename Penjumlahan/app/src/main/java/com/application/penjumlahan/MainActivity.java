package com.application.penjumlahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private TextView jumlah;
    private Button btnhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callUiComponent();
        doEvent();
    }

    private void callUiComponent() {
        bil1 = findViewById(R.id.input_bilangan_pertama);
        bil2 = findViewById(R.id.input_bilangan_kedua);
        jumlah = findViewById(R.id.hasil);
        btnhasil = findViewById(R.id.btn_hitung);
    }

    private void doEvent(){
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");
    }
}