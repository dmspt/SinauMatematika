package id.or.redroid.sinaumatematika;


import android.support.v4.app.FragmentActivity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.or.redroid.sinaumatematika.fragment.Bab1;
import id.or.redroid.sinaumatematika.fragment.Bab2;
import id.or.redroid.sinaumatematika.fragment.Bab3;
import id.or.redroid.sinaumatematika.fragment.Bab4;
import id.or.redroid.sinaumatematika.fragment.Bab5;
import id.or.redroid.sinaumatematika.fragment.Bab6;


public class MateriActivity extends FragmentActivity implements View.OnClickListener {

    Button btnBab1, btnBab2, btnBab3, btnBab4, btnBab5, btnBab6;
    TextView kepo;
    Bab1 bab1;
    Bab2 bab2;
    Bab3 bab3;
    Bab4 bab4;
    Bab5 bab5;
    Bab6 bab6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        btnBab1 = (Button) findViewById(R.id.bab1);
        btnBab2 = (Button) findViewById(R.id.bab2);
        btnBab3 = (Button) findViewById(R.id.bab3);
        btnBab4 = (Button) findViewById(R.id.bab4);
        btnBab5 = (Button) findViewById(R.id.bab5);
        btnBab6 = (Button) findViewById(R.id.bab6);

        btnBab1.setOnClickListener(this);
        btnBab2.setOnClickListener(this);
        btnBab3.setOnClickListener(this);
        btnBab4.setOnClickListener(this);
        btnBab5.setOnClickListener(this);
        btnBab6.setOnClickListener(this);

    }

    void mbab1() {
        bab1 = new Bab1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.timpaaku, bab1);
        ft.commit();
    }

    void mbab2() {
        bab2 = new Bab2();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.timpaaku, bab2);
        ft.commit();
    }

    void mbab3() {
        bab3 = new Bab3();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.timpaaku, bab3);
        ft.commit();
    }

    void mbab4() {
        bab4 = new Bab4();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.timpaaku, bab4);
        ft.commit();
    }

    void mbab5() {
        bab5 = new Bab5();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.timpaaku, bab5);
        ft.commit();
    }

    void mbab6() {
        bab6 = new Bab6();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.timpaaku, bab6);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btnBab1) {
            mbab1();
        }
        if (v == btnBab2) {
            mbab2();
        }
        if (v == btnBab3) {
            mbab3();
        }
        if (v == btnBab4) {
            mbab4();
        }
        if (v == btnBab5) {
            mbab5();
        }
        if (v == btnBab6) {
            mbab6();
        }

    }
}
