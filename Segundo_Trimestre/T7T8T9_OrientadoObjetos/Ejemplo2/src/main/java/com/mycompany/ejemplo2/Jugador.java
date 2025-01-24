package com.mycompany.ejemplo2;

public class Jugador {
    
    private String nombre;
    private String posicion;
    private int edad;
    private int salario;
    
    //CONSTRUCTOR
    public Jugador(String n, String p, int e, int s){
        
        this.nombre = n;
        this.edad = e;
        this.posicion = p;
        this.salario = s;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    //SETTERS
    
    //toString
    public String toString(){
        return this.nombre + this.posicion + this.salario;
    }
    
    

}
