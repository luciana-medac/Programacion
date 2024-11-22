public class EjercicioGeneral3 {
    /*
     * Desarrolla un programa que funcione como marcador de un partido de
     * tenis/pádel. Para simplificarlo, supondremos que el partido tiene un solo
     * juego. El programa preguntará quién ha ganado el punto, el usuario introduce
     * jugador1 o jugador2, y el programa mostrará el marcador (15-30, 30-40, etc.).
     * Cuando un jugador gane, el programa indicará que el jugador ha ganado el
     * juego y finalizará.
     * 
     * Si no conoces cómo funciona la puntuación en tenis/pádel, busca información
     * sobre ello. Las puntuaciones son: 0, 15, 30, 40. Se gana el punto si vuelve a
     * ganar teniendo ya 40, siempre y cuando el otro jugador no tenga 40 también,
     * porque entonces sería ventaja y se necesita ganar un punto más.
     * 
     * Ejemplo de consola:
     * 
     * 0 - 0
     * Quién ha ganado el punto? jugador1
     * 15 - 0
     * Quién ha ganado el punto? jugador1
     * 30 - 0
     * Quién ha ganado el punto? jugador2
     * 30 - 15
     * Quién ha ganado el punto? jugador1
     * 40 - 15
     * Quién ha ganado el punto? jugador1
     * Gana el jugador 1
     */

    public static void main(String[] args) {
        
        String[] puntuacion = {"0", "15", "30", "40"};

        int puntoJ1 =  2;

        System.out.println("El jugador 1 tiene " + puntuacion[puntoJ1]);

        


        /* 
        int puntoJugador1 = 0;
        int puntoJugador2 = 0;

        String punto = " ";
        
        System.out.println(puntoJugador1 + " - " + puntoJugador2);

        do{
            
            punto = System.console().readLine( " ¿Quién ha marcado? ");

            switch (punto) {
                case "jugador1":
                    puntoJugador1 = puntoJugador1 + 15;
                    break;
                case "jugador2":
                    puntoJugador2 = puntoJugador2 + 15;
                    break;
                default:
                    break;
            }

            System.out.println(puntoJugador1 + " - " + puntoJugador2);
        }while();
        */
    }
}
