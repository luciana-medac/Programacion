public class Ejercicio16 {

    /*
     * Desarrolla un programa que calcule el IMC de una persona (índice de masa corporal) 
     * tras preguntarle su peso y su altura.
     */

    public static void main(String[] args) {
        
        Float peso = Float.parseFloat(System.console().readLine("¿Cuánto pesas en kg? "));
        Float alturaUno = Float.parseFloat(System.console().readLine("¿Cuál es tu altura en metros? "));

        //Calculamos el IMC
        float IMC = peso / (alturaUno * alturaUno);

        //Muestro los resultado
        System.out.println("Tu IMC es: " + IMC);


    }
    
}
