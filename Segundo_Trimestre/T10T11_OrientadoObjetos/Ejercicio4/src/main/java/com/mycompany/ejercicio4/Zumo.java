/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

public class Zumo extends Bebida{
    
    private tipoZumo tipo;
    
    public Zumo(String n, String m, int p, tipoZumo t){
        
        super(n, m, p);
        
        this.tipo = t;
        
    }
    
    public tipoZumo getTipo(){
        return this.tipo;
    }
    
    public void setTipo(tipoZumo t){
        this.tipo = t;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + "Zumo{" + "tipo=" + tipo + '}';
    }
    
    
}
