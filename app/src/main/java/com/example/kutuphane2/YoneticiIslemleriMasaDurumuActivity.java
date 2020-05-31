package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIslemleriMasaDurumuActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriMasaDurumuu;

    public void init() {

        actionbarYöneticiIslemleriMasaDurumuu = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriMasaDurumu);
        setSupportActionBar(actionbarYöneticiIslemleriMasaDurumuu);
        getSupportActionBar().setTitle("Masa Durumu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_masa_durumu);
        init();
    }
}
