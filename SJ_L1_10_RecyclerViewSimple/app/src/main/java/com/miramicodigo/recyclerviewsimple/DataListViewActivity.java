package com.miramicodigo.recyclerviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DataListViewActivity extends AppCompatActivity {

    private ArrayList<String> data;
    private ArrayAdapter<String> adapter;
    private ListView lvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list_view);

        data = new ArrayList<String>();
        for (int i = 0; i < 500000; i++) {
            data.add("Item en ListView posicion: "+ (i+1));
        }

        lvDatos = (ListView) findViewById(R.id.lvDatos);
        adapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1, data
        );
        lvDatos.setAdapter(adapter);
    }
}
