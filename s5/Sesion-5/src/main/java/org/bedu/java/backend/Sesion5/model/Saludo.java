package org.bedu.java.backend.Sesion5.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Saludo {

    private final String nombre;


    public Saludo(String nombre){
        this.nombre = "Beto";

        System.out.println("Creando una instancia de Saludo");
    }
    public String getNombre(){
        return nombre;
    }
}
