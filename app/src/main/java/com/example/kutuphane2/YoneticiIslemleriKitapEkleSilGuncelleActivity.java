package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriKitapEkleSilGuncelleActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKitapEkleSilGuncellee;

    public void init() {

        actionbarYöneticiIslemleriKitapEkleSilGuncellee = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKitapEkleSilGuncelle);
        setSupportActionBar(actionbarYöneticiIslemleriKitapEkleSilGuncellee);
        getSupportActionBar().setTitle("Kitap Ekle/Sil/Güncelle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kitap_ekle_sil_guncelle);
        init();
    }
}
