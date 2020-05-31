package com.example.kutuphane2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKullaniciArama extends Fragment {

    public FragmentKullaniciArama() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kullanici_arama, container, false);

        Intent intentKullaniciArama = new Intent(getActivity(), KullaniciAramaActivity.class);
        getActivity().startActivity(intentKullaniciArama);

        return view;
    }
}
