package com.miramicodigo.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvTextoUno, tvTextoDos;
    private EditText etCajaTexto;
    private Button btnRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvTextoUno = (TextView) findViewById(R.id.tvTextoUno);
        tvTextoDos = (TextView) findViewById(R.id.tvTextoDos);
        etCajaTexto = (EditText) findViewById(R.id.etCajaTexto);
        btnRespuesta = (Button) findViewById(R.id.btnRespuesta);

        Bundle bundle = getIntent().getExtras();

        try {
            tvTextoUno.setText(bundle.getString("valor1", ""));
            tvTextoDos.setText(bundle.getString("valor2", ""));
        }catch (Exception e) {
        }

        try {
            etCajaTexto.setText(bundle.getString("valor3", ""));
        } catch (Exception e) {
        }

        btnRespuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("respuesta", etCajaTexto.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
