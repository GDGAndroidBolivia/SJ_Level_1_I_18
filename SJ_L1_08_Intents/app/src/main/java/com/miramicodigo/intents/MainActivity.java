package com.miramicodigo.intents;

import android.Manifest;
import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton ibAbrirActivity, ibEnviarDatos, ibRecibirDatos, ibAbrirMarcado, ibLlamar, ibAbrirGoogleMaps,
            ibAbrirStreetView, ibAbrirPaginaWeb, ibAbrirBuscador,
            ibCompartirTexto, ibEnviarEmail, ibAbrirApp, ibCambiarWallpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibAbrirActivity = (ImageButton) findViewById(R.id.ibAbrirActivity);
        ibEnviarDatos = (ImageButton) findViewById(R.id.ibEnviarDatos);
        ibRecibirDatos = (ImageButton) findViewById(R.id.ibDevolverDatos);

        ibAbrirMarcado = (ImageButton) findViewById(R.id.ibAbrirMarcado);
        ibLlamar = (ImageButton) findViewById(R.id.ibLlamar);
        ibAbrirGoogleMaps = (ImageButton) findViewById(R.id.ibAbrirGoogleMaps);
        ibAbrirStreetView = (ImageButton) findViewById(R.id.ibAbrirStreetView);
        ibAbrirPaginaWeb = (ImageButton) findViewById(R.id.ibAbrirPaginaWeb);
        ibAbrirBuscador = (ImageButton) findViewById(R.id.ibAbrirBuscador);
        ibCompartirTexto = (ImageButton) findViewById(R.id.ibCompartirTexto);
        ibEnviarEmail = (ImageButton) findViewById(R.id.ibEnviarEmail);
        ibAbrirApp = (ImageButton) findViewById(R.id.ibAbrirApp);
        ibCambiarWallpaper = (ImageButton) findViewById(R.id.ibAsignarWallpaper);

        ibAbrirActivity.setOnClickListener(this);
        ibEnviarDatos.setOnClickListener(this);
        ibRecibirDatos.setOnClickListener(this);

        ibAbrirMarcado.setOnClickListener(this);
        ibLlamar.setOnClickListener(this);
        ibAbrirGoogleMaps.setOnClickListener(this);
        ibAbrirStreetView.setOnClickListener(this);
        ibAbrirPaginaWeb.setOnClickListener(this);
        ibAbrirBuscador.setOnClickListener(this);
        ibCompartirTexto.setOnClickListener(this);
        ibEnviarEmail.setOnClickListener(this);
        ibAbrirApp.setOnClickListener(this);
        ibCambiarWallpaper.setOnClickListener(this);
    }

    public void abrirActivity() {

    }

    public void enviarDatos() {

    }

    public void devolverDatos() {

    }

    public void abrirMarcado() {

    }

    public void llamar() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        if(permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE}, 123);
        } else {

        }
    }
    public void abrirGoogleMaps() {

    }

    public void abrirStreetView() {

    }

    public void abrirPaginaWeb() {

    }

    public void abrirBuscador() {

    }

    public void compartirTexto() {

    }

    public void enviarEmail() {

    }

    public void abrirApp() {

    }

    public void asignarWallpaper() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibAbrirActivity:
                abrirActivity();
                break;
            case R.id.ibEnviarDatos:
                enviarDatos();
                break;
            case R.id.ibDevolverDatos:
                devolverDatos();
                break;
            case R.id.ibAbrirMarcado:
                abrirMarcado();
                break;
            case R.id.ibLlamar:
                llamar();
                break;
            case R.id.ibAbrirGoogleMaps:
                abrirGoogleMaps();
                break;
            case R.id.ibAbrirStreetView:
                abrirStreetView();
                break;
            case R.id.ibAbrirPaginaWeb:
                abrirPaginaWeb();
                break;
            case R.id.ibAbrirBuscador:
                abrirBuscador();
                break;
            case R.id.ibCompartirTexto:
                compartirTexto();
                break;
            case R.id.ibEnviarEmail:
                enviarEmail();
                break;
            case R.id.ibAbrirApp:
                abrirApp();
                break;
            case R.id.ibAsignarWallpaper:
                asignarWallpaper();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 2) {
            if(resultCode == RESULT_OK) {
                String resultado = data.getStringExtra("respuesta").toString();
                Toast.makeText(this, "RESPUESTA: "+resultado, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Se cancelo la respuesta", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 123:
                if((grantResults.length > 0) &&
                        (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    llamar();
                }else{
                    Toast.makeText(this, "PERMISO DENEGADO", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
