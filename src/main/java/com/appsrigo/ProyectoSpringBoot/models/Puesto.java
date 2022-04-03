package com.appsrigo.ProyectoSpringBoot.models;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Puesto {
    private String nombre;
    private String nivel;
    private String numColaboradores;
    private int num; // Mi comentario

    public Puesto() {
        // Constructor vacío
    }
}
