package com.miramicodigo.recyclerviewcards;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String nombre;
    private String tipo;
    private int imagen;

    public Pokemon() {

    }

    public Pokemon(String nombre, String tipo, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}


