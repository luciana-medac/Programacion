public class Ejercicio4 {

    /*
     * Desarrolla un programa que, al iniciarse, te muestre un menú dando a elegir:
     * Elegir un número decimal aleatorio entre 0 y 1
     * Elegir un número entero aleatorio entre 0 y 10
     * Eledir un color aleatorio
     * Elegir una vocal aleatoria
     */

    public static void numACeroUno (int n1){

        float numA = 0;
        int numB = 0;

        switch (n1) {
            case 1:
                numA = (float)Math.random();
                System.out.println("El número aleatorio es: " + numA);
                break;
            case 2:
                numB = (int)(Math.random()*11);
                System.out.println("El número aleatorio es: " + numB);
            default:
                break;
        }

    }

    public static void color(int num1){

        String[] color = {"amarillo" , "azul", "blanco", "negro", "rojo", "verde" , "marrón", "morado"};
        int colorNum = (int)(Math.random()*color.length);

    }

    public static void vocales(int v1){

        char[] vocal = {'a','e','i','o','u'}; //loe elementos de char se escribe con una comilla
        int vocalNum = (int)(Math.random()*vocal.length);
    }

    public static void main(String[] args) {

        System.out.println("Elige una opción: ");
        System.out.println("1. Número aleatroio entre el 0 y 1");
        System.out.println("2. Número aleatorio entre 0 y 10");
        System.out.println("3. Color aleatorio");
        System.out.println("4. Vocal aleatoria");
        int opcion = Integer.parseInt(System.console().readLine("elección: "));

        switch (opcion) {
            case 1:
                numACeroUno(opcion);
                break;
            case 2:
                numACeroUno(opcion);
                break;
            case 3:
                color(opcion);
                break;
            case 4:
                vocales(opcion);
                break;
            default:
            System.out.println("ERROR ------- No es una opción");
                break;
        }

    }
    
}
