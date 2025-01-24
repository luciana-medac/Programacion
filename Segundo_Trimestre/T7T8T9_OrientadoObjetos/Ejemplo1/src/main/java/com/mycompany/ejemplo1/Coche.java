package com.mycompany.ejemplo1;

public class Coche {
    
    //ATRIBUTOS
    private Persona propietario; //EL TIPO DE VARIABLE ES PERSONA, es como usar un String
    private String marca;
    private int km;
    
    //CONSTRCUTOR
    public Coche(Persona p, String m, int km){
        
        this.propietario = p;
        this.marca = m;
        this.km = km;
    }
    
    //toString
    public String toString(){
        return "El coche de: " + this.propietario.getNombre() + " es un " + this.marca + " y tiene de km: " + this.km;
    }
    
    
}
