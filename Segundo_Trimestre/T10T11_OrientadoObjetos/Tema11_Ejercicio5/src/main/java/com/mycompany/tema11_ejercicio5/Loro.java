/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema11_ejercicio5;

/**
 *
 * @author molin
 */
public class Loro extends Animal{
    
    private boolean puedeHablar;
    
    public Loro(String n, int e, boolean pH){
        super(n, e);
        this.puedeHablar = pH;
    }

    public boolean isPuedeHablar() {
        return puedeHablar;
    }

    public void setPuedeHablar(boolean puedeHablar) {
        this.puedeHablar = puedeHablar;
    }
    
    @Override
    public String hacerSonido(){
        
        if (puedeHablar == true) {
            return "¡Hola!"; 
        } else {
            return "Craa";
        }
        
    }
    
    @Override
    public boolean esAdulto(){
        
        return super.getEdad() >= 2;
        
    }
}
