public class Ejercicio30 {

    /*
     * Algoritmo que pida números (Se pedirá por consola la cantidad de números a introducir)
     * El programa, l finalizar debe informr cuántos número son mayores que 100,
     * cuantos menos de 100 y cuántos iguales que 100
     */

    public static void main(String[] args) {
        
        int numPedir = Integer.parseInt(System.console().readLine("¿Cuántos números son? "));

        //Creamos variables fuera del ciclo

        int numero = 0;
        int numMayor = 0;
        int numMenor = 0;
        int numIgual = 0;

        for(int i = 0; i < numPedir; i++){

            numero = Integer.parseInt(System.console().readLine("Introduce el número " + (i + 1) + " "));

            if (numero > 100) {
            
                numMayor += 1;

            }

            else if (numero < 100) {

                numMenor += 1;
                
            }

            else if (numero == 100) {
                
                numIgual += 1;
                
            }

            System.out.println("Números mayores que 100: " + numMayor + " " + " Números menores que 100: " + numMenor + " " + "Númeroes iguales que 100: " + numIgual );

        }


    }
    
}
