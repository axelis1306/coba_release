package com.example.ghoniy.tugasfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment1 extends Fragment {
    private View.OnClickListener click;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment1_layout
        return inflater.inflate(R.layout.fragment1, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);
        final Button b = (Button) getActivity().findViewById(R.id.buttonF1);
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction= fragmentManager.beginTransaction();
        click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 lmfragment = new fragment2();
                fragmentTransaction.replace(R.id.ui_container, lmfragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        };
        b.setOnClickListener(click);
    }
}