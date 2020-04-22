package com.example.kutuphane2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.nav_profil){
            setTitle("Profil");
            FragmentYoneticiProfil fragment=new FragmentYoneticiProfil();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram,fragment,"FragmentYoneticiProfil");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_yonetici_islemleri){
            setTitle("Yönetici İşlemleri");
            FragmentYoneticiIslemleri fragment=new FragmentYoneticiIslemleri();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram,fragment,"FragmentYoneticiIslemleri");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_arama){
            setTitle("Arama");
            FragmentYoneticiArama fragment=new FragmentYoneticiArama();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram,fragment,"FragmentYoneticiArama");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_hakkimizda){
            setTitle("Hakkımızda");
            FragmentYoneticiHakkimizda fragment=new FragmentYoneticiHakkimizda();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram,fragment,"FragmentYoneticiHakkimizda");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_iletisim){
            setTitle("İletişim");
            FragmentYoneticiIletisim fragment=new FragmentYoneticiIletisim();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram,fragment,"FragmentYoneticiIletisim");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_cikis_yap) {
            Intent GirisYapActivity=new Intent(MainActivity.this,
                    GirisYapActivity.class);
            startActivity(GirisYapActivity);
        }

        DrawerLayout drawer=(DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
