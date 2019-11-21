package com.example.ghoniy.tugasfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static EditText telp;
    private Button btn;
    private android.support.v4.app.FragmentManager fragmentManager;
    private android.support.v4.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        telp = (EditText) findViewById(R.id.phoneNumber);
        btn = (Button) findViewById(R.id.button);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    public void btnActivityClick(View view) {
        fragment1 f1 = new fragment1();
        fragmentTransaction.add(R.id.ui_container, f1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        btn.setEnabled(false);
    }
}
