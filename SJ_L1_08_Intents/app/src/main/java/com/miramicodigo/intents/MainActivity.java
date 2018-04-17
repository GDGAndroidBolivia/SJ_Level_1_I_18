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
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }

    public void enviarDatos() {
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("valor1", "Envio de Dato");
        intent.putExtra("valor2", "Hola Mundo");
        startActivity(intent);
    }

    public void devolverDatos() {
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("valor3", "Mi nombre es ");
        startActivityForResult(intent, 2);
    }

    public void abrirMarcado() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:77752810"));
        startActivity(intent);
    }

    public void llamar() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        if(permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE}, 123);
        } else {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:77752810"));
            startActivity(intent);
        }
    }
    public void abrirGoogleMaps() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:-16.508355,-68.126270"));
        startActivity(intent);
    }

    public void abrirStreetView() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("google.streetview:cbll=-16.508355,-68.126270"));
        startActivity(intent);
    }

    public void abrirPaginaWeb() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void abrirBuscador() {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "Android");
        startActivity(intent);
    }

    public void compartirTexto() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hola a todos");
        startActivity(intent);
    }

    public void enviarEmail() {
        String [] TO = {"lizarraga.gux@gmail.com, gustavo@gmail.com"};
        String [] CC = {"android@gmail.com"};
        String asunto = "Correo importante";
        String contenido = "Este correo electronico es de prueba";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("text/plain");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, TO);
        intent.putExtra(Intent.EXTRA_CC, CC);
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        intent.putExtra(Intent.EXTRA_TEXT, contenido);

        startActivity(Intent.createChooser(intent, "Enviar correo (demo)"));
    }

    public void abrirApp() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("com.miramicodigo.aplicacion5", "com.miramicodigo.aplicacion5.MainActivity");
        startActivity(intent);
    }

    public void asignarWallpaper() {
        Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
        startActivity(Intent.createChooser(intent, "Cambiar fondo de pantalla"));
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
