package com.mycompany.ejercicio11;

public class Persona {
    
    //ATRINBUTOS
    private String nombre;
    private String dni;
    private int numTelefono;
    
    //CONSTRUCTOR
    public Persona (String n, String d, int numT){
        this.nombre = n;
        this.dni= d;
        this.numTelefono = numT;
    }
        
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getDni(){
        return this.dni;
    }
    public int getNumTelefono(){
        return this.numTelefono;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setDni(String d){
        this.dni = d;
    }
    public void setNumTelefono(int numT){
        this.numTelefono = numT;
    }
    
    //toString
    public String toString(){
        return "nombre: " + this.nombre + " DNI: " + this.dni + " num telefono: " + this.numTelefono;
    }

}
