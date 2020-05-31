package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiAramaActivity extends AppCompatActivity {

    private Toolbar actionbarYoneticiAramaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_arama);

        actionbarYoneticiAramaa = (Toolbar) findViewById(R.id.actionbarYoneticiArama);
        setSupportActionBar(actionbarYoneticiAramaa);
        getSupportActionBar().setTitle("Arama");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
