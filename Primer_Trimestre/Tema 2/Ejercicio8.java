public class Ejercicio8 {

    /*
     * Programa que convierte euros a dólares
     */

    public static void main(String[] args) {
        
        //Convierto y pregunto
        Float euro = Float.parseFloat(System.console().readLine("Introduce el número de euros que quieres convertir "));
        
        //Hago la cuenta
        float conversion = euro * 1.11f;

        //Muestro los resultados
        System.out.println("En total son " + conversion + " dolares");
    }
    
}
