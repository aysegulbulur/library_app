package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriKullaniciGuncellemeIslemiActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullaniciGuncellemeIslemii;

    public void init() {

        actionbarYöneticiIslemleriKullaniciGuncellemeIslemii = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullaniciGuncellemeIslemi);
        setSupportActionBar(actionbarYöneticiIslemleriKullaniciGuncellemeIslemii);
        getSupportActionBar().setTitle("Kullanıcı Bilgilerini Güncelle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanici_guncelleme_islemi);
        init();
    }
}
