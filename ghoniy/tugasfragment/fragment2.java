package com.example.ghoniy.tugasfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class fragment2 extends Fragment {
    private TextView nomor;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment2_layout
        return inflater.inflate(R.layout.fragment2, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);
        final Button b2 = (Button) getActivity().findViewById(R.id.buttonF2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tlp = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+MainActivity.telp.getText()));
                startActivity(tlp);
            }
        });
    }
}