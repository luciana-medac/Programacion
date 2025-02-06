package com.mycompany.ejercicio9;

public class Concepto {
    
    private String descripcion;
    private float precio;
    
    public Concepto(String d, float p){
        this.descripcion = d;
        this.precio = p;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Concepto{" + "descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
//    public float sumarPrecio(Concepto[] c){
//        
//        float precio = 0;
//        
//        for (int i = 0; i < c.length; i++) {
//            precio += c[i].getPrecio();
//        }
//        
//        return precio;
//    }
    

}
