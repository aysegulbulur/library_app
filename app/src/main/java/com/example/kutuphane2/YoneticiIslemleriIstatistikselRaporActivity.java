package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriIstatistikselRaporActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriIstatistikselRaporr;

    public void init() {

        actionbarYöneticiIslemleriIstatistikselRaporr = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriIstatistikselRapor);
        setSupportActionBar(actionbarYöneticiIslemleriIstatistikselRaporr);
        getSupportActionBar().setTitle("İstatistiksel Rapor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_istatistiksel_rapor);
        init();
    }
}
