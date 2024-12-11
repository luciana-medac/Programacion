public class Ejercicio6 {

    /*
     * Escrie un programa que pregunte al usuario 10 números
     * enteros por consola, y que luego los muestre en orden inverso, es 
     * decir, el primero que se introduce es el último en mostrarse 
     * y viceversa
     */

    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
           numeros[i]= Integer.parseInt(System.console().readLine("Introduce un número: "));
        }
        //Empieza en el 9, llega hasta el 0 e imprime de atrás a adelante
        for (int j = numeros.length -1; j >= 0; j-- ){
            System.out.println(numeros[j]);
        }

        //Alternativa
        //for (int i = 0; i < numeros.length; i++) {
        //    System.out.println(numeros[9-1]);
        //}

    }
    
}
