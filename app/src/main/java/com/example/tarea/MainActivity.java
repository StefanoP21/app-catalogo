package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment fragmentPrimero, fragmentSegundo, fragmentTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentPrimero = new PrimerFragment();
        fragmentSegundo = new SegundoFragment();
        fragmentTercero = new TercerFragment();

        //getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments, fragmentInicio).commit();
    }

    public void onClick(View view) {
        transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btnPrimero:
                transaction.replace(R.id.contenedorFragments, fragmentPrimero).commit();
                break;
            case R.id.btnSegundo:
                transaction.replace(R.id.contenedorFragments, fragmentSegundo).commit();
                break;
            case R.id.btnTercero:
                transaction.replace(R.id.contenedorFragments, fragmentTercero).commit();
                break;
        }
    }
}