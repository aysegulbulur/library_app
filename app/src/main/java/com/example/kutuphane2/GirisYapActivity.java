package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kutuphane2.R;

public class GirisYapActivity extends AppCompatActivity {

    Button btnAcilisSayfasiKullaniciGiris,btnAcilisSayfasiYoneticiGiris;

    public void init(){
        btnAcilisSayfasiKullaniciGiris=(Button) findViewById(R.id.btnAcilisSayfasiKullaniciGirisi);
        btnAcilisSayfasiYoneticiGiris=(Button) findViewById(R.id.btnAcilisSayfasiYoneticiGirisi);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_yap);
        init();

        btnAcilisSayfasiKullaniciGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentKullaniciGirisi=new Intent(GirisYapActivity.this,KullaniciGirisiActivity.class);
                startActivity(intentKullaniciGirisi);
            }
        });

        btnAcilisSayfasiYoneticiGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentYoneticiGirisi=new Intent(GirisYapActivity.this,YoneticiGirisiActivity.class);
                startActivity(intentYoneticiGirisi);
            }
        });
    }
}
