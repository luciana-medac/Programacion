package com.mycompany.ejercicio5;

public class Planeta {
    
    //ATRIBUTOS
    private String nombre;
    private int numSatelite;
    private int diametro;
    private int disSol;
    private String tipo;
    private boolean observable;
    
    //CONSTRUCTOR
    public Planeta (String n, int nSa, int d, int nSo, String t, boolean o){
        
        this.nombre = n;
        this.numSatelite = nSa;
        this.diametro = d;
        this.disSol = nSo;
        this.tipo = t;
        this.observable = o;
        
    }
    
    
    //GETTERS
    
    public String getNombre (){
        return this.nombre;
    }
    public int getNumSatelite (){
        return this.numSatelite;
    }
    public int getDiametro (){
        return this.diametro;
    }
    public int getDisSol(){
        return this.disSol;
    }
    public String getTipo (){
        return this.tipo;
    }
    public String getObservable(){
        
        if (this.observable == true) {
            return "Sí, es observable";
        } else {
            return "No, no es observable";
        }
    }
    
    
    //SETTERS
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setNumSatelite(int nSa){
        this.numSatelite = nSa;
    }
    public void setDiametro (int d){
        this.diametro = d;
    }
    public void setDisSol (int nSo){
        this.disSol = nSo;
    }
    public void setTipo (String t){
        this.tipo = t;
    }
    public void setObservable (boolean o){
        this.observable = o;
    }
    
    //toString
    public String toString(){
        return "el planeta es:" + this.nombre + "su distancia con el sol es " + this.disSol + this.observable;
    }
    
    
    //METODOS ADICIONALES
    
    
}
