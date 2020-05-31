package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriKitapListesiActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKitapListesii;

    public void init() {

        actionbarYöneticiIslemleriKitapListesii = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKitapListesi);
        setSupportActionBar(actionbarYöneticiIslemleriKitapListesii);
        getSupportActionBar().setTitle("Kitap Listesi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kitap_listesi);
        init();
    }
}
