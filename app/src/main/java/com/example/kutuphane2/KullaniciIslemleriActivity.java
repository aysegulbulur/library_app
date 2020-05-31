package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KullaniciIslemleriActivity extends AppCompatActivity {

    private Toolbar actionbarKullaniciIslemlerii;

    Button btnUzerimdekiKitaplarr,btnIadeEttiklerimm;

    public void init(){

        actionbarKullaniciIslemlerii = (Toolbar) findViewById(R.id.actionbarKullaniciIslemleri);
        setSupportActionBar(actionbarKullaniciIslemlerii);
        getSupportActionBar().setTitle("Kullanıcı İşlemleri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_islemleri);
        init();

        btnUzerimdekiKitaplarr=(Button) findViewById(R.id.btnUzerimdekiKitaplar);
        btnIadeEttiklerimm=(Button) findViewById(R.id.btnIadeEttiklerim);

        btnUzerimdekiKitaplarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUzerimdekiKitaplar=new Intent(KullaniciIslemleriActivity.this,KullaniciUzerimdekiKitaplarActivity.class);
                startActivity(intentUzerimdekiKitaplar);
            }
        });

        btnIadeEttiklerimm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentIadeEttiklerim=new Intent(KullaniciIslemleriActivity.this,KullaniciIadeEttiklerimActivity.class);
                startActivity(intentIadeEttiklerim);
            }
        });
    }
}
