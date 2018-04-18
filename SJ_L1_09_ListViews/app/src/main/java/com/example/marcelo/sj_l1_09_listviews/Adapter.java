package com.example.marcelo.sj_l1_09_listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marcelo on 18/04/2018.
 */

public class Adapter extends BaseAdapter {

    Context context;
    ArrayList<Personaje> lista;

    public Adapter(Context context, ArrayList<Personaje> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.item_lista,null);

        Personaje personaje = (Personaje) getItem(position);
        ImageView imagen = view.findViewById(R.id.img_item);
        TextView nombre = view.findViewById(R.id.texto_item);

        imagen.setImageResource(personaje.getImagen());
        nombre.setText(personaje.getNombre());

        return view;
    }
}







