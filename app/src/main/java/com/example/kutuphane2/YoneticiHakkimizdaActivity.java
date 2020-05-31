package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiHakkimizdaActivity extends AppCompatActivity {

    private Toolbar actionbarYoneticiHakkimizdaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_hakkimizda);

        actionbarYoneticiHakkimizdaa = (Toolbar) findViewById(R.id.actionbarYoneticiHakkimizda);
        setSupportActionBar(actionbarYoneticiHakkimizdaa);
        getSupportActionBar().setTitle("Hakkımızda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
