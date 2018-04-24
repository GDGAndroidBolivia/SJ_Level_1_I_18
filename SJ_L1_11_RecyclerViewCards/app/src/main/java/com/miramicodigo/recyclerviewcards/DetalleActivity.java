package com.miramicodigo.recyclerviewcards;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetalleActivity extends AppCompatActivity {
    private ArrayList<Pokemon> datos;
    private RecyclerView rvDatos;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;

        llenarPokemones();

        rvDatos = (RecyclerView) findViewById(R.id.rvContenido);

        //layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //layoutManager = new GridLayoutManager(this,2);
        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        rvDatos.setLayoutManager(layoutManager);

        adapter = new RVAdapter(activity, datos);
        rvDatos.setAdapter(adapter);
    }

    public void llenarPokemones() {
        datos = new ArrayList<Pokemon>();
        Resources resources = getResources();
        String[] arrayNombres = resources.getStringArray(R.array.nombre);
        String[] arrayTipos = resources.getStringArray(R.array.tipos);
        TypedArray arrayImgs = resources.obtainTypedArray(R.array.image);
        for(int i=0; i < arrayNombres.length; i++) {
            Pokemon poke = new Pokemon(
                    arrayNombres[i],
                    arrayTipos[i],
                    arrayImgs.getResourceId(i, -1)
            );
            datos.add(poke);
        }
    }














}











