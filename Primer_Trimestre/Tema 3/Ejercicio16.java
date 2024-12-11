public class Ejercicio16 {

    /*
     * Ruleta
     * Bienvenido/a al casino Medac
     * Cuántos años tienes (Si tiene 18 o más, juega, si no finaliza el programa)
     * 
     * A qué quieres apostar:
     * Según a lo que apueste, muestra las opciones aleatorias de cada cual
     * - Colores (Rojo, negro o verde)
     * - Número (0 - 36 incluidos)
     * - Secciones (1, 2 o 3)
     * - Par o impar
     */

    public static void main(String[] args) {
        
        System.out.println("Bienvenido/a al casino Medac");
        int edad = Integer.parseInt(System.console().readLine("¿Cuál es tu edad? "));

        if (edad < 18) {

            System.out.println("No puedes jugar");
            
        }

        else if (edad >= 18) {

            System.out.println("A qué quieres apostar:");
            System.out.println("1. Colores");
            System.out.println("2. Números");
            System.out.println("3. Secciones");
            System.out.println("4. Par o impar");
            String apuesta = System.console().readLine("Introduce la opción: ");
            
            
           if (apuesta.equals("1")) {

            int numAleatorio = (int) (Math.random () *3);

            switch (numAleatorio) {
                case 0:
                    System.out.println("negro");
                    break;
                case 1:
                    System.out.println("rojo");
                    break;
                case 2:
                    System.out.println("verde");
                    break;
            
                }
           }

           else if (apuesta.equals("2")) {

            int num = (int) (Math.random () *36)+1;
            System.out.println(num);
           }

           else if (apuesta.equals("3")) {

            int numSec = (int) (Math.random ()*3);

            switch (numSec) {
                case 0:
                    System.out.println("Sección ganadora: 1 - 12");
                    break;
                case 1:
                    System.out.println("Sección ganadora: 13 - 24");
                    break;
                case 2:
                    System.out.println("Sección ganadora: 25 - 36");
                    break;
            }
           }

           else if (apuesta.equals("4")) {

            int numPI = (int) (Math.random ()*2);

            switch (numPI) {
                case 0:
                    System.out.println("Par");
                    break;
                case 1:
                    System.out.println("Impar");
                    break;
            }
            
           }

           else {
            System.out.println("Esa no es una opción. No juegas");
           }
            
        }



    }
    
}
