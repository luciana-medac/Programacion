public class ExamenPractico2A {
    /*
     * Un teatro tiene 10 filas de asientos con 10 asientos cada una. Al abrir el
     * teatro antes de la función, el trabajador que está en la taquilla inicia el
     * programa (y, lógicamente, aparecen todos los sitios disponibles… lo cual
     * vamos a representar con ceros).
     * 
     * Cuando llegan los primeros clientes, el trabajador pregunta todas estas
     * cuestiones:
     * 
     * ¿Cuántos sois?
     * ¿En qué fila queréis sentaros?
     * En función de la respuesta, el programa dibujará con un numero 1 sobre la
     * matriz los sitios que se van a ocupar (si es posible), y volverá a preguntar
     * a los siguientes.
     * 
     * El programa debe comprobar siempre:
     * 
     * Si los datos introducidos son correctos (por ejemplo, si el teatro tiene
     * filas de la 0 a la 9, el usuario no puede decir que quiere sentarse en la
     * fila 14).
     * Si en la fila en la que desean sentarse hay suficientes sitios libres.
     * Si no se cumple alguna de estas condiciones, el programa se lo indica al
     * usuario y vuelve a preguntar.
     * 
     * El programa solo finalizaría si todos los asientos del teatro estuviesen
     * ocupados. Mientras quede al menos uno libre, el programa seguirá preguntando.
     */

    public static void main(String[] args) {

        //Array del teatro
        int[][] teatro = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        int[][] teatroRelleno = new int[10][10];

        for (int i = 0; i < teatroRelleno.length; i++) {
            for (int j = 0; j < teatroRelleno[0].length; j++) {
                teatroRelleno[i][j] = 1;
            }
        }

        // Muestra el teatro vacio
        System.out.println("---------TEATRO---------");
        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[0].length; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }

        int personas = 0;
        int fila = 0;

            do{
                // El programa pregunta las personas y fila
                personas = Integer.parseInt(System.console().readLine(" ¿Cuántas personas sois? "));
                fila = Integer.parseInt(System.console().readLine("¿En qué fila quereis los asientos? "));


                System.out.println("----------Teatro relleno------");
                for (int i = 0; i < teatro.length; i++) {
                    for (int j = 0; j < teatro[0].length; j++) {
                        teatro[fila][j] = 1;
                        if (teatro[i][j] == 0){
                        System.out.print(teatro[fila][personas] + " "); 
                        } else {
                            System.out.print(teatro[i][j] + " ");
                        }
                    }
                    System.out.println();
                }



                 /*
                for (int i = 0; i < teatro.length; i++) {
                    for (int j = 0; j < teatro[0].length; j++) {
                        if (teatro[i][j] == 1) {
                            System.out.println("No se puede en estos asientos");
                    }
                    }
                }
                */
                    
            }while (personas != teatro.length);
        
    }
}
