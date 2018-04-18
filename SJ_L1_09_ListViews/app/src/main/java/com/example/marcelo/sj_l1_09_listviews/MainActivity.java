package com.example.marcelo.sj_l1_09_listviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Adapter adapter;
    ArrayList<Personaje> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lista_main);
        llenarDatos();
        adapter = new Adapter(MainActivity.this, lista);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this,DescripcionActivity.class);
                intent.putExtra("llavePersonaje", lista.get(position));
                startActivity(intent);
            }
        });

    }

    private void llenarDatos(){
        lista = new ArrayList<>();
        lista.add(new Personaje(R.drawable.homero,"Homero", getString(R.string.Descripcion_Homero)));
        lista.add(new Personaje(R.drawable.marge,"Marge", getString(R.string.Descripcion_Marge)));
        lista.add(new Personaje(R.drawable.bart,"Bart", getString(R.string.Descripcion_Bart)));
        lista.add(new Personaje(R.drawable.lisa,"Lisa", getString(R.string.Descripcion_Lisa)));
        lista.add(new Personaje(R.drawable.maggie,"Maggie", getString(R.string.Descripcion_Maggie)));
        lista.add(new Personaje(R.drawable.apu,"Apu", getString(R.string.Descripcion_Burns)));
        lista.add(new Personaje(R.drawable.burns,"Sr. Burns", getString(R.string.Descripcion_Apu)));
        lista.add(new Personaje(R.drawable.krusty,"Krusty", getString(R.string.Descripcion_Krusty)));
        lista.add(new Personaje(R.drawable.moe,"Moe", getString(R.string.Descripcion_Moe)));
        lista.add(new Personaje(R.drawable.milhouse,"Milhouse", getString(R.string.Descripcion_Milhouse)));
    }

}



