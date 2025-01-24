package com.mycompany.ejercicio11;

public class Zona {
    
    
    //ATRIBUTOS
    private Persona cuidador;
    private int metrosCuadrados;
    private int presupuesto;
    private boolean abierto;
    private Animal[] animales;
    
    //CONSTRUCTOR
    public Zona(Persona c, int mC, int p, boolean a, Animal[] ani){
        
        this.cuidador = c;
        this.metrosCuadrados = mC;
        this.presupuesto = p;
        this.abierto = a;
        this.animales = ani;
        
    }
    
    //GETTERS
    public Persona getCuidador(){
        return this.cuidador;
    }
    public int getMetrosCuadrador(){
        return this.metrosCuadrados;
    }
    public int getPresupuesto(){
        return this.presupuesto;
    }
    public boolean getAbierto(){
       return this.abierto;
    }
    public Animal[] getAnimales(){
        return this.animales;
    }
    
    //SETTERS
    public void setCuidador(Persona c){
        this.cuidador = c;
    }
    public void setMetrosCuadrados(int mC){
        this.metrosCuadrados = mC;
    }
    public void setPresupuesto(int p){
        this.presupuesto = p;
    }
    public void setAbierto(boolean a){
        this.abierto = a;
    }
    public void setAnimales(Animal[] ani){
        this.animales = ani;
    }
    
    //toString
    public String toString(){
        
        if (this.abierto == true) {
            return "persona responsable: " + this.cuidador.getNombre() + " metros cuadrados: " + this.metrosCuadrados + " presupuesto de la zona: " + this.presupuesto + " si esta abierto " + " los animales de la zona son los siguiente: "; 
        } else {
            return "persona responsable: " + this.cuidador.getNombre() + " metros cuadrados: " + this.metrosCuadrados + " presupuesto de la zona: " + this.presupuesto + " no esta abierto " + " los animales de la zona son los siguiente: "; 
        }
       }
    
    public void mostrarNombres(){
    for (int i = 0; i < animales.length; i++) {
            System.out.println(this.animales[i].getNombre());
    }
    }
    
}
