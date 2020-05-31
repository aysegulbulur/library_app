package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class KullaniciIletisimActivity extends AppCompatActivity {

    private Toolbar actionbarKullaniciIletisimm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_iletisim);

        actionbarKullaniciIletisimm = (Toolbar) findViewById(R.id.actionbarKullaniciIletisim);
        setSupportActionBar(actionbarKullaniciIletisimm);
        getSupportActionBar().setTitle("İletişim");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
