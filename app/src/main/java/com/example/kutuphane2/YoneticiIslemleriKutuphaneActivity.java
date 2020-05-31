package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriKutuphaneActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKutuphanee;

    public void init(){

        actionbarYöneticiIslemleriKutuphanee = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKutuphane);
        setSupportActionBar(actionbarYöneticiIslemleriKutuphanee);
        getSupportActionBar().setTitle("Kütüphane");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kutuphane);
        init();
    }
}
