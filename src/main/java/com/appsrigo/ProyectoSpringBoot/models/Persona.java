package com.appsrigo.ProyectoSpringBoot.models;

public class Persona {
    private String nombre;
    private byte edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
