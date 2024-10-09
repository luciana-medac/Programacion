public class Ejercicio29 {

    /*
     * Programa que calcula la media de varias notas, PERO que de primeras
     * no sabemos cuántas notas son. Lo primero, por tanto, es preguntar al usuario
     * cuántas notas son, después preguntar todas las notas, y por
     * último mostrar la media
     */

    public static void main(String[] args) {
        
        int nota = Integer.parseInt(System.console().readLine("Introduce de cuántas notas quieres hacer la media: "));

        String pregunta = " ";

        for(int i = 1; i <= nota; i++ ){

            
            pregunta = System.console().readLine("Introduce la nota " + i + ": ");

        }




    }
    
}
