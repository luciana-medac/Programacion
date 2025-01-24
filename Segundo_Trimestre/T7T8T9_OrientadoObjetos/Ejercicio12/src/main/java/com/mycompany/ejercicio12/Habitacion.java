package com.mycompany.ejercicio12;

public class Habitacion {

    //ATRIBUTOS
    private String nombre;
    private int lado1;
    private int lado2;
    
    //CONSTRUCTOR
    public Habitacion(String n, int l1, int l2){
        
        this.nombre = n;
        this.lado1 = l1;
        this.lado2 = l2;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public int getLado1(){
        return this.lado1;
    }
    public int getLado2(){
        return this.lado2;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setLado1(int l1){
        this.lado1 = l1;
    }
    public void setLado2(int l2){
        this.lado2 = l2;
    }
    
    //toString
    public String toString(){
        return "nombre: " + this.nombre + " lado 1: " + this.lado1 + " lado 2: " + this.lado2;
    }
    
    //Metodos Adicionales
    
    //Devolvemos el area a la clase Vivienda
    public int AreaVivienda(){
        
        int resultado = this.lado1 * this.lado2;
        return resultado;
    }
    
    
}
