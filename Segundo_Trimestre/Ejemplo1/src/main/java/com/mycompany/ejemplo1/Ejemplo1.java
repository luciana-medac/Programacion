package com.mycompany.ejemplo1;

/**
 *
 * EJEMPLO DE ASOCIACION SIMPLE
 */

/* CARDINALIDAD 1:1
Desarrolla una clase coche que tenga un propietario, una marca y un num de km
Del propietario debemos saber su nombre, su dni y su nacionalidad
*/

public class Ejemplo1 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona ("Maria", "78285316D", "Espanola");
        
        Coche coche1 = new Coche(persona1, "bmw", 152000);
        
        System.out.println(persona1);
        System.out.println(coche1);
        
    }
}
