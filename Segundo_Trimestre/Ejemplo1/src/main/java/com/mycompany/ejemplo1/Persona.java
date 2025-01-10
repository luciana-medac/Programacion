package com.mycompany.ejemplo1;

public class Persona {

    private String nombre;
    private String dni;
    private String nacionalidad;
    
    //CONSTRUCTOR
    public Persona(String n, String d, String na){
        this.nombre = n;
        this.dni = d;
        this.nacionalidad = na;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    //toString
    public String toString(){
        return "nombre: " + this.nombre + " con DNI: " + this.dni + " y nacionalidad " + this.nacionalidad;
    }
    
}
