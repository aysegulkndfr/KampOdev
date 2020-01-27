package com.kis2020.kampodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUrun1,etUrun2;
    Intent intent;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrun1 = findViewById(R.id.etUrun1);
        etUrun2 = findViewById(R.id.etUrun2);
    }

    public void toplama(View view) {

        int urun1,urun2;

        urun1 = Integer.parseInt(etUrun1.getText().toString());
        urun2 = Integer.parseInt(etUrun2.getText().toString());

        intent = new Intent(this, otherActivity.class);
        bundle = new Bundle();

        bundle.putInt("Urun1",urun1);
        bundle.putInt("Urun2",urun2);

        intent.putExtras(bundle);

        intent.putExtra("urun1",urun1);
        intent.putExtra("urun2",urun2);

        startActivity(intent);
    }
}
