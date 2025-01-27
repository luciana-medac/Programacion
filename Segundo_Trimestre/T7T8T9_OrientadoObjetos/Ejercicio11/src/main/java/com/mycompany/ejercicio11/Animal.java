package com.mycompany.ejercicio11;

public class Animal {

    //ATRIBUTOS
    
    private String nombre;
    private String tipo;
    private int edad;
    
    //CONSTRUCTOR
    public Animal(String n, String t, int e){
        
        this.nombre = n;
        this.tipo = t;
        this.edad = e;
        
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getEdad(){
        return this.edad;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public void setEdad(int e){
        this.edad = e;
    }
    
    //toString
    public String toString(){
        return "nombre: " + this.nombre + " tipo: " + this.tipo + " edad: " + this.edad;
    }
}
