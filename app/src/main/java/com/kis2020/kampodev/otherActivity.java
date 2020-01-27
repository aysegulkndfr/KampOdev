package com.kis2020.kampodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class otherActivity extends AppCompatActivity {

    int urun1,urun2;
    TextView tvTutar;
    Intent intent;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        tvTutar = findViewById(R.id.tvTutar);
        intent = getIntent();
        bundle = intent.getExtras();

        urun1=bundle.getInt("Urun1");
        urun2=bundle.getInt("Urun2");

        tvTutar.setText((urun1+(urun2))+" TL");
    }
}
