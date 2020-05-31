package com.example.kutuphane2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.sourceforge.jtds.jdbc.MSSqlServerInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKullaniciProfil extends Fragment {

    public FragmentKullaniciProfil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kullanici_profil, container, false);

        Intent intentKullaniciProfil = new Intent(getActivity(), KullaniciProfilActivity.class);
        getActivity().startActivity(intentKullaniciProfil);

        return view;
    }
}
