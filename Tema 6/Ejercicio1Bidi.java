public class Ejercicio1Bidi {

    /*
     * Genera un array de 5x5 relleno de números enteros
     * aleatorios entre el 0 y el 99
     */

    public static void main(String[] args) {
        
        //Creamos el array
        int[][] numeros = new int[5][5];

        //rellenamos el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int)(Math.random()*101);
            }
        }

        //Mostramos el array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
