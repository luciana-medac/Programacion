public class Ejercicio14 {

    /*Genera un array de 10 posiciones relleno con interrogaciones '?'. En una de sus posiciones, aleatoria, habrá un asterisco, pero no se mostrará al usuario. 
    El programa irá preguntando en qué posición cree el usuario que está el asterisco, 
    y le irá dando pistas indicando si debe probar en una posición superior o inferior. 
    Se repite una y otra vez hasta que el usuario acierta, momento en el que se da la enhorabuena y finaliza el programa. 
    */

    public static void main(String[] args) {
        int asterisco = (int)(Math.random()*10);
        String[] inte = new String[10];
        for (int i = 0; i < inte.length; i++) {
            inte[i] = "?";
        }
        inte[asterisco] = "*";

        int pregunta = -1;
        System.out.println("Array de prueba");
        for (int i = 0; i < inte.length; i++) {
            System.out.println(i + "-" + inte[i]);
        }
        System.out.println("=============================");

        do{
            pregunta = Integer.parseInt(System.console().readLine("Posicion [1-10]: ")) - 1;
            if (asterisco < pregunta) {
                System.out.println("posición más abajo");
            } else if (asterisco > pregunta) {
                System.out.println("posicion más arriba");
            } 

        } while (asterisco != pregunta);

        System.out.println("Enhorabuena me has encontrado el hoyo");
    }
    
}
