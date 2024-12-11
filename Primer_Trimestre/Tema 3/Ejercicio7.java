public class Ejercicio7 {

    /*
     * Escribe un programa que nos diga si un número es par o impar
     */

    public static void main(String[] args) {
        
        int num = Integer.parseInt(System.console().readLine("Introduce un número "));

        int numDos = num % 2;

        if (numDos == 0) {

            System.out.println("Es par");
            
        }

        else {

            System.out.println("Es impar");

        }

    }
    
}
