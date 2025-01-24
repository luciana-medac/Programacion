package com.mycompany.ejercicio13;

public class Autor {
    
    //ATRIBUTOS
    private String nombre;
    private String nacionalidad;
    
    //CONSTRUCTOR
    public Autor(String n, String na){
        this.nombre = n;
        this.nacionalidad = na;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setNacionalidad(String na){
        this.nacionalidad = na;
    }
    
    //toString
    public String toString(){
        return "nombre autor: " + this.nombre + " nacionalidad: " + this.nacionalidad;
    }
    
    
}
