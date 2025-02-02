
package com.mycompany.ejercicio4;


public class BebidaAlcoholica extends Bebida{
    
    private tipoBAlcoholica tipo;
    
    public BebidaAlcoholica(String n, String m, int p, tipoBAlcoholica t){
        
        super(n, m, p);
        
        this.tipo = t;
        
    }

    public tipoBAlcoholica getTipo() {
        return tipo;
    }

    public void setTipo(tipoBAlcoholica tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +  "BebidaAlcoholica{" + "tipo=" + tipo + '}';
    }
    
}
