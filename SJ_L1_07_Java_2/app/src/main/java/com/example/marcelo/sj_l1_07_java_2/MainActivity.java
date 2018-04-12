package com.example.marcelo.sj_l1_07_java_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton2);
        editText = (EditText) findViewById(R.id.edit_text);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TerceraActivity.class));
            }
        });
    }

    public void siguiente (View view){
        String cadena = editText.getText().toString();
        Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
        intent.putExtra("LLAVE",cadena);
        startActivity(intent);
    }
}
