package com.mycompany.ejercicio8;

public class Empresa {
    
    //ATRIBUTOS
    private String nombre;
    private String CIF;
    
    //CONSTRUCTOR
    public Empresa(String n, String c){
        
        this.nombre = n;
        this.CIF = c;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", CIF=" + CIF + '}';
    }
    
    

}
