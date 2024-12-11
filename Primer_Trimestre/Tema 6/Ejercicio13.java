public class Ejercicio13 {

public static void main(String[] args) {

        int[] numR = new int[20];
        int num = 101;

        // Rellenamos de números aleatorios
        for (int i = 0; i < numR.length; i++) {
            numR[i] = (int) (Math.random() * 101);
        }

        ////////////////////////////////ORDENAR ARRAY////////////////////////////////


        int[] ordenado = new int[20];
        int posicion = 0;

        for (int i = 0; i < numR.length; i++) {

            for (int j = 0; j < numR.length; j++) {

                if (numR[j] < num) { 
                    num = numR[j]; 
                    posicion = j; 
                }
            }

            ordenado[i] = num; 
            numR[posicion] = 0; 
            num = 101; 
        }

        System.out.println("array ordenado: ");
        for (int q = 0; q < ordenado.length; q++) {
            System.out.println(ordenado[q]);
        }

    }

    /*´
     * Desarrolla un programa al que puedas pasarle un párrafo de un texto 
     * y una palabra que se quiera cambiar en dicho texto. El programa devuelve el mismo
     * texto pero con la palabra qe se desea cambiar en todas sus apariciones
     * 
     * Ejemplo: supongamos que se desea cambiar la palabra "casa" por la palabra
     * "edificación" en el texto: "en aquella casa vivía una familia, pero en aqueela otra vivía solo una persona"
     *      
     */

     /*
    public static void main(String[] args) {
        
        String frase = System.console().readLine("Introduce una frase: ");
        String palabra = System.console().readLine("Introduce la palabra a cambiar: ");
        String pNueva = System.console().readLine("Introduce la palabra nueva: ");

        frase = frase.replace(palabra, pNueva);

        System.out.println(frase);
    }
         */
    
}
