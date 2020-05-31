package com.example.kutuphane2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class YoneticiIslemleriKullanicidaOlanKitaplarActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullanicidaOlanKitaplarr;

    public void init() {

        actionbarYöneticiIslemleriKullanicidaOlanKitaplarr = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullanicidaOlanKitaplar);
        setSupportActionBar(actionbarYöneticiIslemleriKullanicidaOlanKitaplarr);
        getSupportActionBar().setTitle("Kullanıcıda Olan Kitaplar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanicida_olan_kitaplar);
        init();
    }
}
