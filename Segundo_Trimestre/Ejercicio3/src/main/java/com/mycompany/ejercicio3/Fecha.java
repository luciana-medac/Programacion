package com.mycompany.ejercicio3;

public class Fecha {
    
    //Atributos
    private int dia;
    private int mes;
    private int ano;
    
    //Constructor
    public Fecha(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    //Getters
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    
    //Setters
    public void setDia(int d){
        this.dia = d;
    }
    public void setMes(int m){
        this.mes = m;
    }
    public void setAno(int a){
        this.ano = a;
    }
    
    //Métodos
    
    public void imprimirDia(){
        System.out.println("El día es: " + this.dia);
    }
    
    public void imprimirMes(){
        System.out.println("El mes es: " + this.mes);
    }
    
    public void imprimirAno(){
        System.out.println("El año es: " + this.ano);
    }
    
    public void imprimirFecha(){
        System.out.println("La fecha es: " + this.);
    }
    
}
