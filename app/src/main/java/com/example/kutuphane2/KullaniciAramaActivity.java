package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class KullaniciAramaActivity extends AppCompatActivity {

    private Toolbar actionbarKullaniciAramaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_arama);

        actionbarKullaniciAramaa = (Toolbar) findViewById(R.id.actionbarKullaniciArama);
        setSupportActionBar(actionbarKullaniciAramaa);
        getSupportActionBar().setTitle("Arama");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
