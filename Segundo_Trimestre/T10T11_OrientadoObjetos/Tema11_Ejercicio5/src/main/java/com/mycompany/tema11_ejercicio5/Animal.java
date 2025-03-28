/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema11_ejercicio5;

/**
 *
 * @author molin
 */
public abstract class Animal {
    
    protected String nombre;
    protected int edad;
    
    
    public Animal(String n, int e){
        
        this.nombre = n;
        this.edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    //METODOS
    
    public abstract String hacerSonido();
    
    public abstract boolean esAdulto();
    
}
