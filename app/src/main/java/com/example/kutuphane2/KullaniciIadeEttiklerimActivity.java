package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class KullaniciIadeEttiklerimActivity extends AppCompatActivity {

    private Toolbar actionbarKullaniciIadeEttiklerimm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_iade_ettiklerim);

        actionbarKullaniciIadeEttiklerimm = (Toolbar) findViewById(R.id.actionbarKullaniciIadeEttiklerim);
        setSupportActionBar(actionbarKullaniciIadeEttiklerimm);
        getSupportActionBar().setTitle("İade Ettiklerim");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
