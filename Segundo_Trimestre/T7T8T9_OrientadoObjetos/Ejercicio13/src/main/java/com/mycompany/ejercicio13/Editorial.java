package com.mycompany.ejercicio13;

public class Editorial {
    
    //De las editoriales se debe conocer su nombre, el país y la cantidad  de libros publicados.
    //ATRIBUTOS
    private String nombre;
    private String pais;
    private int LibrosPublicados;
    
    //CONSTRCUTOR
    public Editorial(String n, String p, int lp){
        
        this.nombre = n;
        this.pais = p;
        this.LibrosPublicados = lp;
        
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getPais(){
        return this.pais;
    }
    public int getLibrosPublicados(){
        return this.LibrosPublicados;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setPais(String p){
        this.pais = p;
    }
    public void setLibrosPublicados(int lp){
        this.LibrosPublicados = lp;
    }
    
    //toString
    public String toString(){
        return "editorial: " + this.nombre + " origen: " + this.pais + " libros publicados " + this.LibrosPublicados;
    }
    
    
}
