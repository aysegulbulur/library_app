package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriKullaniciSilActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullaniciSill;

    public void init() {

        actionbarYöneticiIslemleriKullaniciSill = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullaniciSil);
        setSupportActionBar(actionbarYöneticiIslemleriKullaniciSill);
        getSupportActionBar().setTitle("Kullanıcı Sil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanici_sil);
        init();
    }
}
