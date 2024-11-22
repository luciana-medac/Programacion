public class Ejercicio9 {

    /*
     * Versión 2: en lugar de mostrar solo el mayor, muéstralos todos ordenados de
     * mayor a menor
     */

    public static void main(String[] args) {

        int[] numR = new int[20];
        int num = 0;

        // Rellenamos de números aleatorios
        for (int i = 0; i < numR.length; i++) {
            numR[i] = (int) (Math.random() * 101);
        }

        ////////////////////////////////ORDENAR ARRAY////////////////////////////////

        // comprobamos cuál es mayor
        int[] ordenado = new int[20];
        int posicion = 0;

        for (int i = 0; i < numR.length; i++) {

            for (int j = 0; j < numR.length; j++) {

                if (numR[j] > num) { // se compara si es mayor que el que se tenía antes
                    num = numR[j]; // guardo el número en el array
                    posicion = j; // guardo la posición del número mayor
                }
            }

            ordenado[i] = num; //guarda en mayor en la primera posición
            numR[posicion] = 0; //
            num = 0; 
        }

        System.out.println("array ordenado: ");
        for (int q = 0; q < ordenado.length; q++) {
            System.out.println(ordenado[q]);
        }

    }

}
