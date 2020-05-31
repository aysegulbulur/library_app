package com.example.kutuphane2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKullaniciIslemleri extends Fragment {

    public FragmentKullaniciIslemleri() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kullanici_islemleri, container, false);

        /*Button btnKullaniciUzerimdekiKitaplarr = (Button) view.findViewById(R.id.btnUzerimdekiKitaplar);
        btnKullaniciUzerimdekiKitaplarr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent kullaniciUzerimdekiKitaplar = new Intent(getActivity(), KullaniciUzerimdekiKitaplarActivity.class);
                getActivity().startActivity(kullaniciUzerimdekiKitaplar);
            }
        });

        Button btnKullaniciIadeEttiklerimm = (Button) view.findViewById(R.id.btnIadeEttiklerim);
        btnKullaniciIadeEttiklerimm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent kullaniciIadeEttiklerim = new Intent(getActivity(), KullaniciIadeEttiklerimActivity.class);
                getActivity().startActivity(kullaniciIadeEttiklerim);
            }
        });*/

        Intent intentKullaniciIslemleri = new Intent(getActivity(), KullaniciIslemleriActivity.class);
        getActivity().startActivity(intentKullaniciIslemleri);

        return view;
    }
}
