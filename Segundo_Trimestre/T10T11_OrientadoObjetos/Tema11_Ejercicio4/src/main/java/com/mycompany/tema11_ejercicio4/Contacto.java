/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema11_ejercicio4;

/**
 *
 * @author molin
 */
public class Contacto {
    
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    private String email;
    
    //CONSTRUCTOR
    public Contacto(String n, String t, String e){
        
        this.nombre = n;
        this.telefono = t;
        this.email = e;
        
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
}
