package com.example.tarea;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class PrimerFragment extends Fragment {
    public PrimerFragment() {
        // Required empty public constructor
    }

    Button btnRegresar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_primero, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnRegresar = view.findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        startActivity(new Intent(view.getContext(),MainActivity.class));
    }
}