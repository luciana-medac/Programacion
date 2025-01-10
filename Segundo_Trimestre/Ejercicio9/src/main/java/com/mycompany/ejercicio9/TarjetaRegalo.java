package com.mycompany.ejercicio9;

public class TarjetaRegalo {
    
    private String nombre;
    private String numA;
    private int saldo;
    
    //CONSTRUCTOR
    public TarjetaRegalo (String n) {  

    this.nombre = n;
    
    this.numA = " " + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10);
    
    this.saldo = 20;
}
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getNumA(){
        return this.numA;
    }
    public int getSaldo(){
        return this.saldo;
    }
    
    //SETTERS
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setNumA(String numA){
        this.numA = numA;
    }
    public void setSaldo(int s){
        this.saldo = s;
    }
    
    //toString
    public String toString(){
        return "tarjeta es" + this.nombre + " con este numero " + this.numA + " y este saldo " + this.saldo;
    }
    
    //Metodos adicionales
    
    public void Gastar(float dinero){
        this.saldo -= dinero; //this.saldo = this.saldo - dinero;
    }
    
    public void Recargar(float dinero){
        this.saldo += dinero;
    }
}
