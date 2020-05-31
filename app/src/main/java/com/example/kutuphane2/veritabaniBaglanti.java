package com.example.kutuphane2;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class veritabaniBaglanti {

    @SuppressLint("NewApi")
    public static Connection CONN(){
        String sunucuAdresi = "DELL";
        String veritabani = "kutuphane1";
        String veritabaniKullaniciAdi="kutuphane";
        String veritabaniParola="Kutuphane";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnURL = "jdbc:jtds:sqlserver://" + sunucuAdresi + ";" + "databaseName=" + veritabani + ";user=" + veritabaniKullaniciAdi + ";password=" + veritabaniParola + ";";
            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return conn;
    }
}
