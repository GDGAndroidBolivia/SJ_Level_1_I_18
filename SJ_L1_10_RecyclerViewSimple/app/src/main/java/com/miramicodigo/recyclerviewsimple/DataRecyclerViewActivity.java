package com.miramicodigo.recyclerviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> listaDatos;
    private RecyclerViewAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_recycler_view);

        recyclerView = (RecyclerView) findViewById(R.id.rvDatos);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getApplicationContext()));

        listaDatos = llenarDatos();

        adaptador = new RecyclerViewAdapter(listaDatos);
        recyclerView.setAdapter(adaptador);
    }

    public List<String> llenarDatos() {
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 500000; i++) {
            data.add("Item en posicion: "+(i + 1));
        }
        return data;
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTexto;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvTexto = (TextView) itemView;
        }
    }

    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
        private List<String> data;

        public RecyclerViewAdapter(List<String> a) {
            data = a;
        }

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getApplicationContext());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,
                    parent, false);
            return new RecyclerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, int position) {
            String dato = data.get(position);
            holder.tvTexto.setText(dato);
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }

}
