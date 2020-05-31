package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YoneticiIslemleriKullaniciListesiActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullaniciListesii;

    public void init() {

        actionbarYöneticiIslemleriKullaniciListesii = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullaniciListesi);
        setSupportActionBar(actionbarYöneticiIslemleriKullaniciListesii);
        getSupportActionBar().setTitle("Kullanıcı Listesi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanici_listesi);
        init();
    }
}
