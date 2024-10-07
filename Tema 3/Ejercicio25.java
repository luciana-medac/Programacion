public class Ejercicio25 {

    /*
     * Desarrolla un programa que te pregunte una frase y te la repite. El programa va a repetir la frase
     * 100 veces, excepto que una de las veces la palabra
     */

    public static void main(String[] args) {

        String frase = "";
        
        for(int i = 0; i < 100; i++) {

            frase = System.console().readLine("Introduce una frase: ");

            //El if comprueba todas las veces
            if (frase.equals("stop")) {

                break; //Detiene el bucle
                
            }

            else{

                System.out.println(frase);

            }

        }

    }
    
}
