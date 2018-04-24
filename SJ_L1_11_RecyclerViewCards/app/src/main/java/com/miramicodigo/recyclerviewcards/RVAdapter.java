package com.miramicodigo.recyclerviewcards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Pokemon> items;

    public RVAdapter(Activity activity, ArrayList<Pokemon> data) {
        this.context = activity;
        this.items = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_grid, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Typeface tf_black = Typeface.createFromAsset(context.getAssets(), "fonts/roboto_black.ttf");
        Typeface tf_thin = Typeface.createFromAsset(context.getAssets(), "fonts/roboto_thin.ttf");

        holder.tvTitulo.setTypeface(tf_black);
        holder.tvSubtitulo.setTypeface(tf_thin);

        Pokemon poke = items.get(position);
        holder.tvTitulo.setText(poke.getNombre());
        holder.tvSubtitulo.setText(poke.getTipo());
        holder.ivImagen.setImageResource(poke.getImagen());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivImagen;
        private TextView tvTitulo;
        private TextView tvSubtitulo;

        public ViewHolder(final View itemView) {
            super(itemView);

            ivImagen = (ImageView) itemView.findViewById(R.id.ivImagen);
            tvTitulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            tvSubtitulo = (TextView) itemView.findViewById(R.id.tvSubtitulo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(context, DetalleActivity.class);
                    intent.putExtra("poke", items.get(position));
                    context.startActivity(intent);
                }
            });

        }
    }
}
