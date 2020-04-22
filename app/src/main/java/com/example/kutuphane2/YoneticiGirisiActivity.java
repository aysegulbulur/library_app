package com.example.kutuphane2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class YoneticiGirisiActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar actionbarYoneticiGirisi;
    Button btnYoneticiGirisi;
    EditText txtYoneticiGirisAdi,txtYoneticiGirisParola;
    ProgressBar islemCubugu;
    Connection con;
    String sunucuAdresi,veritabani,veritabaniKullaniciAdi, veritabaniParola;

    public void init(){

        actionbarYoneticiGirisi=(Toolbar) findViewById(R.id.actionbarYoneticiGirisi);
        setSupportActionBar(actionbarYoneticiGirisi);
        getSupportActionBar().setTitle("Yönetici Girişi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_girisi);
        init();
        btnYoneticiGirisi=(Button) findViewById(R.id.btnYoneticiGiris);
        btnYoneticiGirisi.setOnClickListener(this);
        txtYoneticiGirisAdi=(EditText) findViewById(R.id.txtYoneticiAdiGiris);
        txtYoneticiGirisParola=(EditText) findViewById(R.id.txtYoneticiParolaGiris);
        islemCubugu=(ProgressBar) findViewById(R.id.islemCubugu);
        islemCubugu.setVisibility(View.GONE);

        sunucuAdresi = "DELL";
        veritabani = "kutuphane1";
        veritabaniKullaniciAdi="kutuphane";
        veritabaniParola="Kutuphane";

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btnYoneticiGirisi.getId()) {
            YoneticiGirisiActivity.YoneticiGirisKontrol baglan = new YoneticiGirisiActivity.YoneticiGirisKontrol();
            baglan.execute("");
        }
    }

    public class YoneticiGirisKontrol extends AsyncTask<String, String, String> {
        String mesaj = "";
        Boolean basariliMi = false;

        @Override
        protected void onPreExecute() {
            islemCubugu.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String r) {
            islemCubugu.setVisibility(View.GONE);
            Toast.makeText(YoneticiGirisiActivity.this, r, Toast.LENGTH_SHORT).show();
            if (basariliMi) {
                Toast.makeText(YoneticiGirisiActivity.this, "Giriş Başarılı", Toast.LENGTH_LONG).show();
            }
        }

        @Override
        protected String doInBackground(String... strings) {
            String yoneticiAdi = txtYoneticiGirisAdi.getText().toString();
            String yoneticiParola = txtYoneticiGirisParola.getText().toString();
            if (yoneticiAdi.trim().equals("") || yoneticiParola.trim().equals(""))
                mesaj = "Kullanıcı Adı ve Şifre Girin";
            else {
                try {
                    con = Baglanti(veritabaniKullaniciAdi,veritabaniParola,veritabani,sunucuAdresi);
                    if (con == null) {
                        mesaj = "Bağlantınızı Kontrol Edin";
                    } else {
                        String sorgu = "SELECT*FROM yoneticiParola WHERE yonetici_kullanici_adi= '" + yoneticiAdi.toString() +
                                "' and yonetici_kullanici_parola= '" + yoneticiParola.toString() + "'";
                        Statement durum = con.createStatement();
                        ResultSet rs = durum.executeQuery(sorgu);
                        if (rs.next()) {
                            mesaj = "Giriş Başarılı";
                            basariliMi = true;
                            con.close();

                            Intent MainActivity=new Intent(YoneticiGirisiActivity.this,
                                    MainActivity.class);
                            startActivity(MainActivity);

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
