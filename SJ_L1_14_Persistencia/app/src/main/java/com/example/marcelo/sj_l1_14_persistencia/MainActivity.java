package com.example.marcelo.sj_l1_14_persistencia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cabecera;
    EditText usuario, contraseña;

    private String nombreArchivoInterno = "prueba_archivo_int.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cabecera = (TextView) findViewById(R.id.texto_cabecera);
        usuario = (EditText) findViewById(R.id.editText_usuario);
        contraseña = (EditText) findViewById(R.id.editText_contraseña);

    }

    public void ingresar(View view){
        String nombreUsuario = usuario.getText().toString();
        cabecera.setText(nombreUsuario);
    }

    /*
    public void archivoInterno(){
        guardarInterno();
        leerInterno();
    }

    public void guardarInterno() {
        if (!usuario.getText().toString().equals("")) {
            try {
                OutputStreamWriter output = new OutputStreamWriter(
                        openFileOutput(nombreArchivoInterno, Context.MODE_PRIVATE));
                output.write(usuario.getText().toString());
                output.close();
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        } else {
            Toast.makeText(getApplicationContext(),
                    "Debe ingresar datos para guardar.",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void leerInterno() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(openFileInput(nombreArchivoInterno)));
            String texto = br.readLine();
            br.close();
            usuario.setText(texto);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }*/

}
