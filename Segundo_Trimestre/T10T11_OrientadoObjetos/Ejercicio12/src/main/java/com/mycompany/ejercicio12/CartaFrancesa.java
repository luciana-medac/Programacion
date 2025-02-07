package com.mycompany.ejercicio12;

public class CartaFrancesa extends Carta {
    private ColorCarta color; // Usa el enum en lugar de String

    public CartaFrancesa(String palo, int numero) {
        super(palo, numero);

        // Asignar color según el palo
        if (palo.equalsIgnoreCase("Corazones") || palo.equalsIgnoreCase("Diamantes")) {
            this.color = ColorCarta.ROJO;
        } else {
            this.color = ColorCarta.NEGRO;
        }
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta Francesa -> Palo: " + palo + ", Número: " + numero + ", Color: " + color);
    }
}
