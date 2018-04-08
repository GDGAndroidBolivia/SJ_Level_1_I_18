package com.example.cesar.sj_l1_06_java_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText num1;
    private EditText num2;
    private TextView textoResultado;
    private int res;
    private float resulDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);
        textoResultado = (TextView) findViewById(R.id.resultado);

    }

    public void sumar(View v){

        if (num1.getText().toString().equals("") || num2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Llenar las casillas",Toast.LENGTH_LONG).show();
        }else{
            int v1 = Integer.parseInt(num1.getText().toString());
            int v2 = Integer.parseInt(num2.getText().toString());
            res = v1 +v2;
            textoResultado.setText("Resultado"+" "+res);
        }

    }
    public void restar(View v){

        int v1 = Integer.parseInt(num1.getText().toString());
        int v2 = Integer.parseInt(num2.getText().toString());
        res = v1 - v2;
        textoResultado.setText("Resultado"+" "+res);

    }
    public void multiplicar(View v){

        int v1 = Integer.parseInt(num1.getText().toString());
        int v2 = Integer.parseInt(num2.getText().toString());
        res = v1 * v2;
        textoResultado.setText("Resultado"+" "+res);

    }
    public void dividir(View v){

        if (num1.getText().toString().equals("") || num2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Llenar las casillas",Toast.LENGTH_LONG).show();
        }else{

            float v1 = Float.parseFloat(num1.getText().toString());
            float v2 = Float.parseFloat(num2.getText().toString());
            if (v2 != 0){
                resulDiv = v1 / v2;
                textoResultado.setText("Resultado"+" "+resulDiv);
            }else{
                Toast.makeText(getApplicationContext(),"No se puede dividir",Toast.LENGTH_LONG).show();
            }

        }

    }

}
