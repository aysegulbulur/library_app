package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriKategorilerActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKategorilerr;

    public void init() {

        actionbarYöneticiIslemleriKategorilerr = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKategoriler);
        setSupportActionBar(actionbarYöneticiIslemleriKategorilerr);
        getSupportActionBar().setTitle("Kategoriler");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kategoriler);
        init();
    }
}
