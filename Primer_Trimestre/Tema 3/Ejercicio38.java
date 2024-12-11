public class Ejercicio38 {
    /*
     * Programa que te pide la base y el exponente de una potencia 
     * y te devuelve el resultado
     */

    public static void main(String[] args) {
        
        int base = Integer.parseInt(System.console().readLine("Introduce un número de la base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduce un número del exponente: "));
        int resultado = base;
        
        for (int i = 1; i < exponente; i++) {

            resultado = resultado * base; //resultado *= base

        }
    
        System.out.println("El total es: " + resultado);

    }

}   
