package com.mycompany.ejercicio5;

/**
 * Crea la estructura de clases necesarias para un videojuego de fútbol como
 * FIFA. Simplificando, supongamos que tenemos dos tipos de jugadores, atacantes
 * y defensores. Todos los jugadores tienen los siguientes datos:
 *
 * id: Número único para identificar al jugador. nombre: Nombre del jugador.
 * equipo: Nombre del equipo al que pertenece. edad: edad del jugador.
 *
 * Los atacantes tendrán:
 *
 * habilidadControl (0-100). potenciaDisparo (0-100). Puedes modificar estos
 * datos o añadir otros que consideres importantes.
 *
 * Los defensores tendrán:
 *
 * habilidadDefensa (0-100). Puedes modificar estos datos o añadir otros que
 * consideres importantes.
 *
 * Crea una clase Partido que contenga un método simularJugada() que permita
 * pasar por parámetro un jugador atacante y otro defensor, y nos indique quién
 * gana la jugada (gana quien tenga la combinación más alta según la fórmula que
 * tú definas en base a sus habilidades).
 *
 * Prueba el programa creando varios atacantes, defensores, simulando varias
 * jugadas e imprimiendo los resultados.
 *
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Atacante atacante1 = new Atacante(111, "Marcos", "Real Madrid", 24, 86, 52);
        Defensor defensa1 = new Defensor(111, "Juan", "Juventus", 21, 89);
        
        Atacante atacante2 = new Atacante(222, "Juande", "Real Jaen", 23, 54, 51);
        Defensor defensa2 = new Defensor(222, "Arturo", "Granada", 21, 51);
        
        Atacante atacante3 = new Atacante(333, "Martin", "España", 26, 87, 78);
        Defensor defensa3 = new Defensor(333, "Carlos", "Japon", 25, 89);
        
        //PARA MEZCLAR EN UN ARRAY, ELEMENTOS DE DISTINTOS TIPOS
        /*
        Jugador[] jugadores = {
            new Atacante(bla, bla, bla),
            new Defensor(ñam, ñam, ñam)
        }
        
        Para llamar a un jugador o para utilizar simularJugada()
        
        Partido.simularJugada(a1, d1);
        
        -- Modificariamos el método para que en lugar de 
        meter atacante y defensor, que sea jugador y jugador
        
        -- La única forma de juntar elementos de distinto tipo en un array
        es creando un array del padre que contengan hijos
        */
        
        
        Partido.simularJugada(atacante1.habilidadTotal(), defensa1.habilidadTotal());
        
        Partido.simularJugada(atacante2.habilidadTotal(), defensa2.habilidadTotal());
        
        Partido.simularJugada(atacante3.habilidadTotal(), defensa3.habilidadTotal());
        
        
    }
}
