public class Ejercicio8 {

    /*
     * Escribe un programa que rellene un array de 20 posiciones con números
     * aleatorios entre el 0 y el 100 
     * El programa debe imprimir todos los números del array
     * 
     * Versión 1: Después, el programa debe mostrar por pantalla cuál es
     * el mayor número de todos los que tiene el array
     * 
     * Versión 2: en lugar de mostrar solo el mayor, muéstralos todos ordenados de 
     * mayor a menor
     */

    public static void main(String[] args) {
        
        int[] numR= new int[20];
        int num = 0;

        //Rellenamos de números aleatorios
        for (int i = 0; i < numR.length; i++) {
            numR[i] = (int)(Math.random()*101);
        }

        //comprobamos cuál es mayor
        for (int j = 0; j < numR.length; j++) {

            if (numR[j] > num) {
                num = numR[j];
            }

        }

        System.out.println( "El mayor es: " + num);
        
    }
    
}
