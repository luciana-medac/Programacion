package com.mycompany.ejercicio7;

public class Televisor extends Electrodomestico {

    private int tamañoPulgadas;

    public Televisor(String m, float cE, int tP) {

        super(m, cE);
        this.tamañoPulgadas = tP;
    }

    //METODO QUE SE VA A SOBREESCRIBIR
    /*
      el televisor consume 0,1kWh encendida y 0,001kWh apagada.
     */
    @Override
    public void calcularConsumoDiario(int horasUso) {

        float a = super.getConsumoEnergetico();
        
        int apagada = 24 - horasUso;
        
        float consumoApagada = ((float) apagada * 0.001f);
        
        System.out.println("El consumo total es: " + ((a * horasUso) + consumoApagada ));
    }

}
