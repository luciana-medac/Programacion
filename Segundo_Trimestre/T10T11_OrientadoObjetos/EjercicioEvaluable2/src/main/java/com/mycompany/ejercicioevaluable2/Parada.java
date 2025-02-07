package com.mycompany.ejercicioevaluable2;

public class Parada {
    
    //ATRIBUTOS
    private String nombre;
    
    //CONTRUCTOR
    public Parada(String n){
        
        this.nombre = n;
        
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Parada{" + "nombre=" + nombre + '}';
    }
    
    
}
