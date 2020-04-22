package com.example.kutuphane2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.example.kutuphane2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout2);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.nav_profil){
            setTitle("Profil");
            FragmentKullaniciProfil fragment=new FragmentKullaniciProfil();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram2,fragment,"FragmentKullaniciProfil");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_kullanici_islemleri){
            setTitle("Kullanıcı İşlemleri");
            FragmentKullaniciIslemleri fragment=new FragmentKullaniciIslemleri();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram2,fragment,"FragmentKullaniciIslemleri");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_arama){
            setTitle("Arama");
            FragmentKullaniciArama fragment=new FragmentKullaniciArama();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram2,fragment,"FragmentKullaniciArama");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_hakkimizda){
            setTitle("Hakkımızda");
            FragmentKullaniciHakkimizda fragment=new FragmentKullaniciHakkimizda();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram2,fragment,"FragmentKullaniciHakkimizda");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_iletisim){
            setTitle("İletişim");
            FragmentKullaniciIletisim fragment=new FragmentKullaniciIletisim();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram2,fragment,"FragmentKullaniciIletisim");
            fragmentTransaction.commit();
        }else if(id==R.id.nav_cikis_yap) {
            Intent GirisYapActivity=new Intent(Main2Activity.this,
                    GirisYapActivity.class);
            startActivity(GirisYapActivity);
        }

        DrawerLayout drawer=(DrawerLayout) findViewById(R.id.drawer_layout2);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
