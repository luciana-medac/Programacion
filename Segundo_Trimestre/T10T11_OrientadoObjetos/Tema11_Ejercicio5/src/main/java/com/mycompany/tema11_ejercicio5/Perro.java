/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema11_ejercicio5;

/**
 *
 * @author molin
 */
public class Perro extends Animal{
    
    private String raza;
    
    public Perro(String n, int e, String r){
        
        super(n, e);
        this.raza = r;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "raza=" + raza + '}';
    }
    
    @Override
    public String hacerSonido() {
        return "Guau";
        
    }

    @Override
    public boolean esAdulto() {
        return super.getEdad() >= 2;
    }
    
    
    
}
