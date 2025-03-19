package com.mycompany.tema11_ejercicio2;

public class Supermercado {
    
    //ATRIBUTOS
    private String nombre;
    private String ubicacion;
    private Seccion[] secciones;
    
    public Supermercado(String n, String u, Seccion[] s){
        
        this.nombre = n;
        this.ubicacion = u;
        this.secciones = s;
        
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Seccion[] getSecciones() {
        return secciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setSecciones(Seccion[] secciones) {
        this.secciones = secciones;
    }

    //toString
    @Override
    public String toString() {
        return "Supermercado{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", secciones=" + secciones + '}';
    }
    
    
    

}
