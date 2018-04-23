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



    }

    public List<String> llenarDatos() {
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 500000; i++) {
            data.add("Item en posicion: "+(i + 1));
        }
        return data;
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {



        public RecyclerViewHolder(View itemView) {
            super(itemView);



        }
    }

    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {



        public RecyclerViewAdapter(List<String> a) {



        }

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, int position) {



        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
