
package com.mycompany.ejercicio7;

public class Lavadora extends Electrodomestico{
    
    private float capacidadKg;
    
    public Lavadora(String m, float cE, int cKg){
        
        super(m, cE);
        this.capacidadKg = cKg;
    }
    
    //METODO QUE SE VA A SOBREESCRIBIR
    
    @Override
    public void calcularConsumoDiario(int horasUso){
        
        float a = super.getConsumoEnergetico();
                
        System.out.println("el consumo energetico sería: " + ( a * horasUso));
        
    }
}
