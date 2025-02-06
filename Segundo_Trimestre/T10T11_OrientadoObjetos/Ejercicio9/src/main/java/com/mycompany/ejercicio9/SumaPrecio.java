package com.mycompany.ejercicio9;

public class SumaPrecio {
    
    public static float sumarPrecio(Concepto[] c){
        
        float precio = 0;
        
        for (int i = 0; i < c.length; i++) {
            precio += c[i].getPrecio();
        }
        
        return precio;
    }

}
