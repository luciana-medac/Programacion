public class Ejercicio9 {

    /*
     * Programa que pide al usuario el número de trozos en los que está dividida una tarta y 
     * cuántas personas van a comer, 
     * e indica a cuántos trozos toca cada persona 
     * y cuántos sobra
     */

    public static void main(String[] args) {
        
        int tarta = Integer.parseInt(System.console().readLine("¿En cuántos trozos está dividida la tarta? "));
        int personas = Integer.parseInt(System.console().readLine("¿Cuantas personas van a comer? "));

        int trozos = tarta / personas;
        // % el signo del porcentaje sirve para sacar el resto de una división, 
        //tenemos el dividendo que es tarta y el divisor que es personas
        int sobra = tarta % personas;

        System.out.println("Toca a cada persona: " + trozos + " trozos");
        System.out.println("y sobran: " + sobra );
    }
    
}
