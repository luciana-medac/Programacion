package com.mycompany.ejercicio6;

public class Fraccion {

    //ATRIBUTOS
    private int numerador;
    private int denominador;
    
    
    //CONSTRUCTOR
    public Fraccion(int d, int n) {
    
    this.denominador = d;
    this.numerador = n;
    }
    
    //GETTERS
    public int getDenominador(){
        return this.denominador;
    }
    public int getNumerador(){
        return this.numerador;
    }
    
    //SETTERS
    public void setDenominador(int d){
        this.denominador = d;
    }
    public void setNumerador(int n){
        this.numerador = n;
    }
    
    //TOSTRING
    
    
    public String toString(){
        
        int division =  (this.numerador) / (this.denominador);
        return "la division es: " + division;
    }
    
    //METODOS ADICIONALES
    
    public void mostrarNumerador(){
        
        System.out.println(this.numerador);
    }
    public void mostrarDenominador(){
        System.out.println(this.denominador);
    }
    
    int resultado = 0;
    
    public void divisionExacta(){
        
        resultado = this.numerador%this.denominador;
        
        if (resultado == 0 ) {
            System.out.println("La division es exacta");
        } else {
            System.out.println("La division no es exacta");
        }
    }
    
}
