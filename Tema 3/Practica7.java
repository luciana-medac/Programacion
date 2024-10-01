public class Practica7 {

    /*
     * Escribe un programa que nos diga si un número es par o impar
     */

    public static void main(String[] args) {
        
        //Primero preguntamos por el número
        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

        //Hacemos la cuenta dividiendo el número por 2
        numero = numero%2;
        
        if (numero == 0) {

            System.out.println("Es par");
            
        }

        else {

            System.out.println("Es impar");

        }

    }
    
}
