package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YoneticiIslemleriKullaniciGuncelleActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullaniciGuncellee;

    Button btnKullaniciGuncelleme;

    public void init() {

        actionbarYöneticiIslemleriKullaniciGuncellee = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullaniciGuncelle);
        setSupportActionBar(actionbarYöneticiIslemleriKullaniciGuncellee);
        getSupportActionBar().setTitle("Kullanıcı Güncelle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanici_guncelle);
        init();

        btnKullaniciGuncelleme=(Button) findViewById(R.id.btnKullaniciGuncelle);

        btnKullaniciGuncelleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiIslemleriKullaniciGuncelleme=new Intent(YoneticiIslemleriKullaniciGuncelleActivity.this,YoneticiIslemleriKullaniciGuncellemeIslemiActivity.class);
                startActivity(intentYoneticiIslemleriKullaniciGuncelleme);
            }
        });
    }
}
