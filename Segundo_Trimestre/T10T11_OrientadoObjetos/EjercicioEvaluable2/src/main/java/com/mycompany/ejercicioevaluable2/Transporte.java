package com.mycompany.ejercicioevaluable2;

public class Transporte {
    
    private String nombre;
    private Parada[] listaparada;
    private int tiempo;
    
    public Transporte(String n, Parada[] p, int t){
        
        this.nombre = n;
        this.listaparada = p;
        this.tiempo = t;
        
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public Parada[] getListaparada() {
        return listaparada;
    }

    public int getTiempo() {
        return tiempo;
    }
    
   //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaparada(Parada[] listaparada) {
        this.listaparada = listaparada;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    //toString
    @Override
    public String toString() {
        return "Transporte{" + "nombre=" + nombre + ", listaparada=" + listaparada + ", tiempo=" + tiempo + '}';
    }
    
}
