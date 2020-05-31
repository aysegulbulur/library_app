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
public class FragmentKullaniciHakkimizda extends Fragment {

    public FragmentKullaniciHakkimizda() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kullanici_hakkimizda, container, false);

        Intent intentKullaniciHakkimizda = new Intent(getActivity(), KullaniciHakkimizdaActivity.class);
        getActivity().startActivity(intentKullaniciHakkimizda);

        return view;
    }
}
