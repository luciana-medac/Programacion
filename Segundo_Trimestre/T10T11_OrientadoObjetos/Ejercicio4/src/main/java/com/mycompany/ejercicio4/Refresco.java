
package com.mycompany.ejercicio4;

public class Refresco extends Bebida{
    
    private tipoRefresco tipo;
    
    public Refresco(String n, String m, int p, tipoRefresco t){
        
        super(n, m, p);
        this.tipo = t;
    }
    
    public tipoRefresco getTipo(){
        return this.tipo;
    }
    
    public void setTipo(tipoRefresco t){
        this.tipo = t;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + "Refresco{" + "tipo=" + tipo + '}';
    }
    
}
