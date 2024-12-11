public class Ejercicio12 {

    /*
     * Gusano que se come los 8 y los 0 que encuentra
     * en un número (y los cambia 'x')
     */

    public static void main(String[] args) {
        
        String frase = System.console().readLine("Introduce un número: ");

        frase = frase.replace("8", "x");
        frase = frase.replace("0", "x");

        System.out.println("Gusano travieso: " + frase);
    }
}