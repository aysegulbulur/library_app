package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YoneticiIslemleriActivity extends AppCompatActivity {

    private Toolbar actionbarYoneticiIslemlerii;

   Button btnKutuphanee,btnKullaniciListesii,btnKullaniciEkleSilGuncellee,btnKitapListesii, btnkitapEkleSilGuncelle,
           btnKullanicidaOlanKitaplarr,btnKategorilerr,btnIstatistikselRaporr,btnMasaDurumuu;

    public void init(){

        actionbarYoneticiIslemlerii = (Toolbar) findViewById(R.id.actionbarYoneticiIslemleri);
        setSupportActionBar(actionbarYoneticiIslemlerii);
        getSupportActionBar().setTitle("Yönetici İşlemleri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri);
        init();

        btnKutuphanee=(Button) findViewById(R.id.btnKutuphane);
        btnKullaniciListesii=(Button) findViewById(R.id.btnKullaniciListesi);
        btnKullaniciEkleSilGuncellee=(Button) findViewById(R.id.btnKullaniciEkleSilGuncelle);
        btnKitapListesii=(Button) findViewById(R.id.btnKitapListesi);
        btnkitapEkleSilGuncelle=(Button) findViewById(R.id.btnKitapEkleSilGuncelle);
        btnKullanicidaOlanKitaplarr=(Button) findViewById(R.id.btnKullanicidaOlanKitaplar);
        btnKategorilerr=(Button) findViewById(R.id.btnKategoriler);
        btnIstatistikselRaporr=(Button) findViewById(R.id.btnIstatistikselRapor);
        btnMasaDurumuu=(Button) findViewById(R.id.btnMasaDurumu);

        btnKutuphanee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKutuphane=new Intent(YoneticiIslemleriActivity.this,YoneticiIslemleriKutuphaneActivity.class);
                startActivity(intentYoneticiIslemleriKutuphane);
            }
        });

        btnKullaniciListesii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullaniciListesi=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriKullaniciListesiActivity.class);
                startActivity(intentYoneticiIslemleriKullaniciListesi);
            }
        });

        btnKullaniciEkleSilGuncellee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullaniciEkleSilDuzenle=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriKullaniciEkleSilGuncelleActivity.class);
                startActivity(intentYoneticiIslemleriKullaniciEkleSilDuzenle);
            }
        });

        btnKitapListesii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKitapListesi=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriKitapListesiActivity.class);
                startActivity(intentYoneticiIslemleriKitapListesi);
            }
        });

        btnkitapEkleSilGuncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKitapEkleSilGuncelle=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriKitapEkleSilGuncelleActivity.class);
                startActivity(intentYoneticiIslemleriKitapEkleSilGuncelle);
            }
        });

        btnKullanicidaOlanKitaplarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullanicidaOlanKitaplar=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriKullanicidaOlanKitaplarActivity.class);
                startActivity(intentYoneticiIslemleriKullanicidaOlanKitaplar);
            }
        });

        btnKategorilerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKategoriler=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriKategorilerActivity.class);
                startActivity(intentYoneticiIslemleriKategoriler);
            }
        });

        btnIstatistikselRaporr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriIstatistikselRapor=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriIstatistikselRaporActivity.class);
                startActivity(intentYoneticiIslemleriIstatistikselRapor);
            }
        });

        btnMasaDurumuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriMasaDurumu=new Intent(YoneticiIslemleriActivity.this, YoneticiIslemleriMasaDurumuActivity.class);
                startActivity(intentYoneticiIslemleriMasaDurumu);
            }
        });
    }
}
