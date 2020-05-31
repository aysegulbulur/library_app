package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiProfilActivity extends AppCompatActivity {

    private Toolbar actionbarYoneticiProfill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_profil);

        actionbarYoneticiProfill = (Toolbar) findViewById(R.id.actionbarYoneticiProfil);
        setSupportActionBar(actionbarYoneticiProfill);
        getSupportActionBar().setTitle("Profil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
