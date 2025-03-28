/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema11_ejercicio5;

/**
 *
 * @author molin
 */
public class Gato extends Animal{
    
    private String color;
    
    public Gato(String n, int e, String c){
        
        super(n, e);
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() +  "color=" + color + '}';
    }
    
    //METODOS SOBREESCRITOS
    @Override
    public String hacerSonido(){
         return "Miau";
    }
    
    @Override
    public boolean esAdulto(){
        return super.getEdad() >= 2;
    }
    
    
}
