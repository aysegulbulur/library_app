package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class KullaniciUzerimdekiKitaplarActivity extends AppCompatActivity {

    private Toolbar actionbarKullaniciUzerimdekiKitaplarr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_uzerimdeki_kitaplar);

        actionbarKullaniciUzerimdekiKitaplarr = (Toolbar) findViewById(R.id.actionbarKullaniciUzerimdekiKitaplar);
        setSupportActionBar(actionbarKullaniciUzerimdekiKitaplarr);
        getSupportActionBar().setTitle("Üzerimdeki Kitaplar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
