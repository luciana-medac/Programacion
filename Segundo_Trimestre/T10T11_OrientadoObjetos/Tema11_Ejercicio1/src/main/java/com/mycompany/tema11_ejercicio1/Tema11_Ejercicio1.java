/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema11_ejercicio1;

import javax.sound.midi.SoundbankResource;

/**
 *
 * @author PC218
 */
public class Tema11_Ejercicio1 {

    public static void main(String[] args) {
        
        Vuelo vuelo1 = new Vuelo("Espana", "Italia",360 , 3, 854, 200);
        Vuelo vuelo2 = new Vuelo("Madrid", "Andorra", 405, 2,614, 150);
        
        System.out.println("------------- PRIMER VUELO --------------");
        System.out.println(vuelo1);
        
        System.out.println("INGRESO TOTAL ---------------");
        vuelo1.calcularIngresosTotales();
        System.out.println("COMBUSTIBLE TOTAL -----------");      
        vuelo1.calcularCombustible();
        System.out.println("VUELO LARGO -----------------");
        vuelo1.esVueloLargo();
        
        System.out.println("------------- SEGUNDO VUELO --------------");
        
        System.out.println(vuelo2);
        
        System.out.println("INGRESO TOTAL ---------------");
        vuelo2.calcularIngresosTotales();
        System.out.println("COMBUSTIBLE TOTAL -----------");      
        vuelo2.calcularCombustible();
        System.out.println("VUELO LARGO -----------------");
        vuelo2.esVueloLargo();
    }
}
