package com.example.kutuphane2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KullaniciGirisiActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar actionbarKullaniciGirisi;
    Button btnKullaniciGirisi;
    EditText txtKullaniciGirisAdi, txtKullaniciGirisParola;
    ProgressBar islemCubugu;
    Connection con;
    String sunucuAdresi, veritabani, veritabaniKullaniciAdi, veritabaniParola;

    public void init() {

        actionbarKullaniciGirisi = (Toolbar) findViewById(R.id.actionbarKullaniciGirisi);
        setSupportActionBar(actionbarKullaniciGirisi);
        getSupportActionBar().setTitle("Kullanıcı Girişi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_girisi);
        init();
        btnKullaniciGirisi = (Button) findViewById(R.id.btnKullaniciGiris);
        btnKullaniciGirisi.setOnClickListener(this);
        txtKullaniciGirisAdi = (EditText) findViewById(R.id.txtKullaniciAdiGiris);
        txtKullaniciGirisParola = (EditText) findViewById(R.id.txtKullaniciParolaGiris);
        islemCubugu = (ProgressBar) findViewById(R.id.islemCubugu);
        islemCubugu.setVisibility(View.GONE);

        sunucuAdresi = "DELL";
        veritabani = "kutuphane1";
        veritabaniKullaniciAdi="kutuphane";
        veritabaniParola="Kutuphane";
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btnKullaniciGirisi.getId()) {
            KullaniciGirisKontrol baglan = new KullaniciGirisKontrol();
            baglan.execute("");
        }
    }

    public class KullaniciGirisKontrol extends AsyncTask<String, String, String> {
        String mesaj = "";
        Boolean basariliMi = false;

        @Override
        protected void onPreExecute() {
            islemCubugu.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String r) {
            islemCubugu.setVisibility(View.GONE);
            Toast.makeText(KullaniciGirisiActivity.this, r, Toast.LENGTH_SHORT).show();
            if (basariliMi) {
                Toast.makeText(KullaniciGirisiActivity.this, "Giriş Başarılı", Toast.LENGTH_LONG).show();
            }
        }

        @Override
        protected String doInBackground(String... strings) {
            String kullaniciAdi = txtKullaniciGirisAdi.getText().toString();
            String kullaniciParola = txtKullaniciGirisParola.getText().toString();
            if (kullaniciAdi.trim().equals("") || kullaniciParola.trim().equals(""))
                mesaj = "Kullanıcı Adı ve Şifre Girin";
            else {
                try {
                    con = Baglanti(veritabaniKullaniciAdi,veritabaniParola,veritabani,sunucuAdresi);
                    if (con == null) {
                        mesaj = "Bağlantınızı Kontrol Edin";
                    } else {
                        String sorgu = "SELECT*FROM uyeParola WHERE uye_kullanici_adi= '" + kullaniciAdi.toString() +
                                "' and uye_kullanici_parola= '" + kullaniciParola.toString() + "'";
                        Statement durum = con.createStatement();
                        ResultSet rs = durum.executeQuery(sorgu);
                        if (rs.next()) {
                            mesaj = "Giriş Başarılı";
                            basariliMi = true;
                            con.close();

                            Intent Main2Activity=new Intent(KullaniciGirisiActivity.this,
                                    Main2Activity.class);
                            startActivity(Main2Activity);

                        } else {
                            mesaj = "Hatalı Giriş";
                            basariliMi = false;
                        }
                    }
                } catch (Exception ex) {
                    basariliMi = false;
                    mesaj = ex.getMessage();
                }
            }
            return mesaj;
        }
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
