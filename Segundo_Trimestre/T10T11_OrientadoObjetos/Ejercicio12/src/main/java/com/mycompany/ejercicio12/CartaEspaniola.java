package com.mycompany.ejercicio12;

public class CartaEspaniola extends Carta {
    private String tipo; // "Numérica" o "Especial"

    public CartaEspaniola(String palo, int numero) {
        super(palo, numero);
        this.tipo = (numero >= 1 && numero <= 7) ? "Numérica" : "Especial";
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta Española -> Palo: " + palo + ", Número: " + numero + ", Tipo: " + tipo);
    }
}
