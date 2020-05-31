package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class YoneticiIletisimActivity extends AppCompatActivity {

    private Toolbar actionbarYoneticiIletisimm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_iletisim);

        actionbarYoneticiIletisimm = (Toolbar) findViewById(R.id.actionbarYoneticiIletisim);
        setSupportActionBar(actionbarYoneticiIletisimm);
        getSupportActionBar().setTitle("İletişim");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
