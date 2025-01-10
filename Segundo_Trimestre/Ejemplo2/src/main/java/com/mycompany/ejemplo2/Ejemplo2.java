package com.mycompany.ejemplo2;

/**
 *
 * ASOCIACION COMPUESTA
 */

/* CARDINALIDAD 1:N
Crea un clase equipo qe tenga nombre, ciudad, nSocios y jugadores
De los jugadores se sabe su nombre, posicion, salario y edad

En la clase equipo debe haber un metodo especial que imprima todos los nombres
de sus jugadores (solo sus nombres)
*/
public class Ejemplo2 {

    public static void main(String[] args) {
        
        //De esta forma, creariamos los jugadores por separado y los meteriamos en el array desués
        //Jugador j1 = new Jugador()
        //Jugador[] jMadrid = {j1, j2, ...};
        
        //De esta otra forma, creamos el array y dentro del mismo, los jugadores
        Jugador[] jugadores = {new Jugador("Juan", "delantero", 23, 15200), new Jugador("Martin", "defensa", 22, 15200)};
        
        System.out.println(jugadores);
        
        //Ahora en donde introducimos a los jugadores, le pasamos el nombre del Array
        //Equipo equipo1 = new Equipo ("Real Madrid", "Madrid", 1520, jMadrid); 
        Equipo equipo1 = new Equipo ("Real Madrid", "Madrid ", 1520, jugadores); 
        
        System.out.println(equipo1);
        
        equipo1.mostrarNombres();
        
    }
}
