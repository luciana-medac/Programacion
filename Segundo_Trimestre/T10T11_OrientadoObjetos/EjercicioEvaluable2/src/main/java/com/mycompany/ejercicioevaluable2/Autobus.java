package com.mycompany.ejercicioevaluable2;

public class Autobus extends Transporte{
    
    //ATRIBUTOS
    private Gasolina tipo;
    
    //CONSTRUCTOR
    public Autobus(String n, Parada[] p, int t, Gasolina tipo){
        
        super(n, p, t);
        this.tipo = tipo;
    }
    
    //GETTERS
    public Gasolina getTipo() {
        return tipo;
    }
    
    //SETTERS

    public void setTipo(Gasolina tipo) {
        this.tipo = tipo;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return super.toString() + "Autobus{" + "tipo=" + tipo + '}';
    }
    

}
