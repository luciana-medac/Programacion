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
        Defensor defensa1 = new Defensor(111, "Juan", "Juventus", 21, 89, 51);
        
        Atacante atacante2 = new Atacante(222, "Juande", "Real Jaen", 23, 54, 51);
        Defensor defensa2 = new Defensor(222, "Arturo", "Granada", 21, 51, 49);
        
        
        Partido.simularJugada(atacante1.habilidadTotal(), defensa1.habilidadTotal());
        
        Partido.simularJugada(atacante2.habilidadTotal(), defensa2.habilidadTotal());
        
        
    }
}
