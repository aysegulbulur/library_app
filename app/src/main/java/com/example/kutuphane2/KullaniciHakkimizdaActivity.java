package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class KullaniciHakkimizdaActivity extends AppCompatActivity {

    private Toolbar actionbarKullaniciHakkimizdaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_hakkimizda);

        actionbarKullaniciHakkimizdaa = (Toolbar) findViewById(R.id.actionbarKullaniciHakkimizda);
        setSupportActionBar(actionbarKullaniciHakkimizdaa);
        getSupportActionBar().setTitle("Hakkımızda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
