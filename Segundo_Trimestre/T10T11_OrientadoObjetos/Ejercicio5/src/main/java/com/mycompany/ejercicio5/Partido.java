
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
    
    /*
    -- RELACION DE DEPENDENCIA 
    
    public static void simularJugada(Atacante a, Defensor d){
        
        int resultado = a.getPotenciaDisparo() - d.getHabilidadDefensa();
    
        if(resultado > ){
            //gana el atacante
            sout ("gana tal" + a.getNombre())
        } else {
            //gana el defensa
            sout ("gana tal" + a.getNombre())
        }
    }
     
    */
    
}
