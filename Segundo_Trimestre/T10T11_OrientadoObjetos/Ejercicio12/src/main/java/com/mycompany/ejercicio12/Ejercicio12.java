/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author PC218
 */
public class Ejercicio12 {

    public void main(String[] args) {
        System.out.print("Ingrese la cantidad de cartas a crear: ");
        String cantidadStr = System.console().readLine();
        int cantidad = Integer.parseInt(cantidadStr);

        Carta[] cartas = new Carta[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("¿Qué tipo de carta desea crear? (Española / Francesa): ");
            String tipoCarta = System.console().readLine().toLowerCase();

            if (tipoCarta.equals("española")) {
                System.out.print("Ingrese el palo (Oros, Copas, Espadas, Bastos): ");
                String palo = System.console().readLine();

                System.out.print("Ingrese el número de la carta (1-12): ");
                int numero = Integer.parseInt(System.console().readLine());

                cartas[i] = new CartaEspaniola(palo, numero);

            } else if (tipoCarta.equals("francesa")) {
                System.out.print("Ingrese el palo (Corazones, Diamantes, Tréboles, Picas): ");
                String palo = System.console().readLine();

                System.out.print("Ingrese el número de la carta (1-13): ");
                int numero = Integer.parseInt(System.console().readLine());

                cartas[i] = new CartaFrancesa(palo, numero);
            } else {
                System.out.println("Tipo de carta no válido. Intente de nuevo.");
                i--; // Reintentar la entrada
            }
        }

        System.out.println("\nCartas creadas:");
        for (int i = 0; i < cantidad; i++) {
            cartas[i].mostrarCarta();
        }
    }
}
