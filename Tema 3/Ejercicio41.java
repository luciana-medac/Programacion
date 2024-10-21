public class Ejercicio41 {

    /* EL FAMOSO RETO FIZZBUZZ
    *
    * Escribe un programa que muestre por consola los
    * números de 1 a 100 (ambos incluidos y con un
    * salto de línea entre cada impresión).
    * Se deben imprimir todos los números, excepto los siguientes:
    * - Los múltiplos de 3 se sustituyen por la palabra "fizz".
    * - Los múltiplos de 5 se sustituyen por la palabra "buzz".
    * - Los múltiplos de 3 y de 5 a la vez se sustituyen por la palabra "fizzbuzz".
    *
    * Ejemplo de consola:
    * 1
    * 2
    * fizz
    * 4
    * buzz
    * fizz
    * 7
    * 8
    * fizz
    * buzz
    * 11
    * ...
    */

    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {


            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("fizzbuzz");
                
            }

            else if (i % 3 == 0) {

                System.out.println("buzz");
                
            }

            else if (i % 5 == 0) {

                System.out.println("fizz");
                
            }

            else {

                System.out.println(i);

            }

        }



    }
    
}
