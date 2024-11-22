public class EjercicioGeneral2 {

    /*
     * Crea un tablero de 10x10, lleno de “O”. En la posición [0,0] estará el
     * personaje (usa el símbolo que quieras para representar dicho personaje). Es
     * decir, si mi personajes es una "S", el tablero se vería así:
     * 
     * S O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * O O O O O O O O O O
     * 
     * Una vez mostrado, se preguntará al usuario qué movimiento quiere realizar,
     * debiendo pulsar una de las siguientes teclas:
     * 
     * Si el usuario presiona la tecla “w”, el personaje se mueve hacia arriba.
     * Si el usuario presiona la tecla “a”, el personaje se mueve a la izquierda.
     * Si el usuario presiona la tecla “s”, el personaje se mueve hacia abajo.
     * Si el usuario presiona la tecla “d”, el personaje se mueve a la derecha.
     * En cuanto el usuario introduzca una de las letras correspondientes al
     * movimiento, se volverá a mostrar el tablero, pero ahora el personaje
     * aparecerá en su nueva posición (y en la antigua aparecerá una O).
     * 
     * El programa se repite en bucle para siempre, permitiendo mover
     * permanentemente el personaje por el tablero.
     * 
     * Importante: el personaje no se puede salir del tablero, por lo que deberás
     * controlar esto de alguna forma, como por ejemplo:
     * 
     * Puedes hacer que si va a salirse directamente no se mueva del sitio
     * (dificultad fácil-media).
     * Puedes hacer que si se sale aparezca por el lado opuesto del tablero
     * (dificultad media-alta).
     

    public static void main(String[] args) {

        int filaP = 0;
        int columnaP = 0;

        char[][] tablero = {

                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' }
        };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if (i == filaP && j == columnaP) {
                    System.out.print('S' + " ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }

        while (true) {

            String movimiento = System.console().readLine("Hacia donde lo quieres mover (w,s,d,a)?: ");

            if (movimiento.equals("w")) {
                filaP--;
            } else if (movimiento.equals("a")) {
                columnaP--;
            } else if (movimiento.equals("d")) {
                columnaP++;
                if (columnaP==9) {
                    columnaP = 0;
                } else {
                    columnaP++;
                }

            } else if (movimiento.equals("s")) {
                filaP++;
            } else {
                System.out.println("Movimiento no válido");
            }

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
    
                    if (i == filaP && j == columnaP) {
                        System.out.print('S' + " ");
                    } else {
                        System.out.print(tablero[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
    */
}
