public class Ejercicio11 {
    /*
     * El programa pide al usuario una frase y muestra:
     * - Cuántos caracteres tiene
     * - Cuántas palabras tiene
     */

    public static void main(String[] args) {
        
        String frase = System.console().readLine("Introduce una frase: ");

        //Cuántos caracteres
        System.out.println(frase.length());

        //Cuántas palabras tiene
        String[] fraseTroceada = frase.split(" ");
        System.out.println(fraseTroceada.length);
    }
    
}
