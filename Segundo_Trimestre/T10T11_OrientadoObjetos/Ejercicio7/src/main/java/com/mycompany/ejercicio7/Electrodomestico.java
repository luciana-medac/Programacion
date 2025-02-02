
package com.mycompany.ejercicio7;

/**
 * CLASE PADRE
 * atributos marca y consumoEnergetico
 */
public class Electrodomestico {
    
    private String marca;
    private float consumoEnergetico;
    
    public Electrodomestico(String m, float cE){
        
        this.marca = m;
        this.consumoEnergetico = cE;
    }

    public String getMarca() {
        return marca;
    }

    public float getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    
    
    //METODO A SOBREESCRIBIR
    public void calcularConsumoDiario(int horasUso){
        
        System.out.println("horas de uso: " + horasUso);
        
    }
}
