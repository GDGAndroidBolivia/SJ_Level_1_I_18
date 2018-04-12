package com.example.marcelo.sj_l1_07_java_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textView = (TextView) findViewById(R.id.texto_de_llegada);
        String textoQueLlego = getIntent().getExtras().getString("LLAVE");
        textView.setText(textoQueLlego);
    }
}
