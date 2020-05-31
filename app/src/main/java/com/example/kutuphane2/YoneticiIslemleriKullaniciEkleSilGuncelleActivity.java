package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YoneticiIslemleriKullaniciEkleSilGuncelleActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullaniciEkleSilDuzenlee;

    Button btnKullaniciEklee,btnKullaniciSill,btnKullaniciGuncellee;

    public void init() {

        actionbarYöneticiIslemleriKullaniciEkleSilDuzenlee = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullaniciEkleSilDuzenle);
        setSupportActionBar(actionbarYöneticiIslemleriKullaniciEkleSilDuzenlee);
        getSupportActionBar().setTitle("Kullanıcı Ekle/Sil/Güncelle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanici_ekle_sil_guncelle);
        init();

        btnKullaniciEklee=(Button) findViewById(R.id.btnYoneticiIslemleriKullaniciEkle);
        btnKullaniciSill=(Button) findViewById(R.id.btnYoneticiIslemleriKullaniciSil);
        btnKullaniciGuncellee=(Button) findViewById(R.id.btnYoneticiIslemleriKullaniciGuncelle);

        btnKullaniciEklee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullaniciEkle=new Intent(YoneticiIslemleriKullaniciEkleSilGuncelleActivity.this,YoneticiIslemleriKullaniciEkleActivity.class);
                startActivity(intentYoneticiIslemleriKullaniciEkle);
            }
        });

        btnKullaniciSill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullaniciSil=new Intent(YoneticiIslemleriKullaniciEkleSilGuncelleActivity.this,YoneticiIslemleriKullaniciSilActivity.class);
                startActivity(intentYoneticiIslemleriKullaniciSil);
            }
        });

        btnKullaniciGuncellee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullaniciGuncelle=new Intent(YoneticiIslemleriKullaniciEkleSilGuncelleActivity.this,YoneticiIslemleriKullaniciGuncelleActivity.class);
                startActivity(intentYoneticiIslemleriKullaniciGuncelle);
            }
        });
    }
}
