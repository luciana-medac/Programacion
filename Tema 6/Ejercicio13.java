public class Ejercicio13 {

    /*´
     * Desarrolla un programa al que puedas pasarle un párrafo de un texto 
     * y una palabra que se quiera cambiar en dicho texto. El programa devuelve el mismo
     * texto pero con la palabra qe se desea cambiar en todas sus apariciones
     * 
     * Ejemplo: supongamos que se desea cambiar la palabra "casa" por la palabra
     * "edificación" en el texto: "en aquella casa vivía una familia, pero en aqueela otra vivía solo una persona"
     *      
     */

    public static void main(String[] args) {
        
        String frase = System.console().readLine("Introduce una frase: ");
        String palabra = System.console().readLine("Introduce la palabra a cambiar: ");
        String pNueva = System.console().readLine("Introduce la palabra nueva: ");

        frase = frase.replace(palabra, pNueva);

        System.out.println(frase);
    }
    
}
