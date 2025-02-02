
package com.mycompany.ejercicio5;


public class Partido {
    
    public static void simularJugada(int a, int d){
        
        if (a > d) {
            System.out.println("GANA EL ATACANTE");
        } else if (a < d) {
            System.out.println("GANA EL DEFENSA");
        } else {
            System.out.println("error: incalculable");
        }
        
    }
    
}
