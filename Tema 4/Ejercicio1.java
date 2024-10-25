public class Ejercicio1 {

    /*
     * Desarrolla un programa que pida 2 números enteros al usuario
     * El programa debe pasar ambos números a un método, que se encargará de sumarlos
     * y mostrar por consola el resultado
     */

    //Definimos el método sumar que recibirá dos parámetros
    public static void numeros (int primerNum, int segundoNum){

        System.out.println("La suma es " + (primerNum + segundoNum));

    }
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(System.console().readLine("Introduce un número: "));
        int num2 = Integer.parseInt(System.console().readLine("Introduce un segundo número: "));

        numeros(num1, num2); //invoca la función (aquí hace la función) //Las variables se tienen que llamar como se llaman en el main

        int num3 = 6;
        int num4 = 4;
        numeros(num3, num4); //Gracias a que los nombres de la función no coincide, se puede seguir usando para hacer lo mismo

        int num5 = 3;
        int num6 = 3;
        numeros(num5, num6);

        numeros(num4, num6);

    }
    
}
