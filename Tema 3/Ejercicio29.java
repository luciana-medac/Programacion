public class Ejercicio29 {

    /*
     * Programa que calcula la media de varias notas, PERO que de primeras
     * no sabemos cuántas notas son. Lo primero, por tanto, es preguntar al usuario
     * cuántas notas son, después preguntar todas las notas, y por
     * último mostrar la media
     */

    public static void main(String[] args) {
        
        int nota = Integer.parseInt(System.console().readLine("Introduce de cuántas notas quieres hacer la media: "));

        float notaFinal = 0f;

        for(int i = 1; i <= nota; i++ ){

            
            notaFinal = notaFinal + Float.parseFloat(System.console().readLine("Introduce la nota " + i + ": "));
            //notaFinal += Float.parseFloat... para no tener que escribir notaFinal dos veces, se puede escribir así
        }

        //es necesario que todos los números que divida sean del mismo tipo de variable
        float media = notaFinal / (float)nota;

        System.out.println("Tu nota media es de: " + media);
    }
    
}
