package com.example.marcelo.sj_l1_09_listviews;

import java.io.Serializable;

/**
 * Created by Marcelo on 18/04/2018.
 */

public class Personaje implements Serializable{

    private int Imagen;
    private String nombre;
    private String descripcion;

    public Personaje(int imagen, String nombre, String descripcion) {
        Imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
