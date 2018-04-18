package com.example.marcelo.sj_l1_09_listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionActivity extends AppCompatActivity {

    ImageView imagen;
    TextView nombre, descripcion;
    Personaje personaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        imagen = (ImageView) findViewById(R.id.img_descripcion);
        nombre = (TextView) findViewById(R.id.nombre_descripcion);
        descripcion = (TextView) findViewById(R.id.descripcion);

        personaje = (Personaje) getIntent().getSerializableExtra("llavePersonaje");

        imagen.setImageResource(personaje.getImagen());
        nombre.setText(personaje.getNombre());
        descripcion.setText(personaje.getDescripcion());


    }
}
