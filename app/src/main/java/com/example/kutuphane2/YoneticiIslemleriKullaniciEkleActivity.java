package com.example.kutuphane2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class YoneticiIslemleriKullaniciEkleActivity extends AppCompatActivity {

    private Toolbar actionbarYöneticiIslemleriKullaniciEklee;

    Button btnKullaniciEkle;
    EditText txtKullaniciEkleAdi,txtKullaniciEkleSoyad,txtKullaniciEkleTc,txtKullaniciEkleDogumTarihi,txtKullaniciEkleCinsiyet,
             txtKullaniciEkleKayitTarihi,txtKullaniciEkleTelefon,txtKullaniciEkleMail,txtKullaniciEkleOkunanKitaplar,txtAdresIl,
             txtAdresIlce,txtAdresMahalle,txtAdresCadde,txtAdresSokak,txtAdresNo,txtAdresKat,txtAdresDaire,txtAdresPostaKodu;
    ProgressBar islemCubugu;
    RelativeLayout rl;
    Connection con;

    String sunucuAdresi = "DELL";
    String veritabani = "kutuphane1";
    String veritabaniKullaniciAdi="kutuphane";
    String veritabaniParola="Kutuphane";

    public void init() {

        actionbarYöneticiIslemleriKullaniciEklee = (Toolbar) findViewById(R.id.actionbarYöneticiIslemleriKullaniciEkle);
        setSupportActionBar(actionbarYöneticiIslemleriKullaniciEklee);
        getSupportActionBar().setTitle("Kullanıcı Ekle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_islemleri_kullanici_ekle);
        init();
    }

    @SuppressLint("NewApi")
    public Connection Baglanti(String user, String password, String database, String server)
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;
        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlserver://" + server +";" + "databaseName=" + database + ";user=" + user+ ";password=" + password + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        }
        catch (SQLException se)
        {
            Log.e("error here 1 : ", se.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            Log.e("error here 2 : ", e.getMessage());
        }
        catch (Exception e)
        {
            Log.e("error here 3 : ", e.getMessage());
        }
        return connection;
    }

}
