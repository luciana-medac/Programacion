package com.mycompany.ejercicio16;

public class Titular {
    
    private String nombre;
    private String dni;
    private String direccion;
    
    //CONSTRUCTOR
    public Titular (String n, String d, String di){
        
        this.nombre = n;
        this.dni = d;
        this.direccion = di;
        
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getDni(){
        return this.dni;
    }
    public String getDireccion(){
        return this.direccion;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setDni(String d){
        this.dni = d;
    }
    public void setDireccion(String di){
        this.direccion = di;
    }
    
    //ToString
    public String toString() {
        return "Titular{" + "nombre:" + nombre + ", dni: " + dni + ", direccion:" + direccion + '}';
    }
    
    
}
