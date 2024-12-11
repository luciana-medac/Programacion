public class Ejercicio24 {

    /*
     * Programa que imprime todos los números pares desde el 2 hasta el que diga el usuario
     */

    public static void main(String[] args) {
        
        int numUser = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = 2; i < numUser; i=i + 2 ){ //la variable de dentro del for es int siempre

            System.out.print(" " + i + " "); //Para mostrarlos en horizontales, al print se le quita el ln

        }

    }
    
}
