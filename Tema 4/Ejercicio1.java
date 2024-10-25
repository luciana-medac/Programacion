public class Ejercicio1 {

    /*
     * Desarrolla un programa que pida 2 números enteros al usuario
     * El programa debe pasar ambos números a un método, que se encargará de sumarlos
     * y mostrar por consola el resultado
     */

    //Definimos el método sumar que recibirá dos parámetros
    //SOBRECARGA DE MÉTODOS

    public static void numeros (int primerNum, int segundoNum){ //Si ejecuto dos número en el main, se ejecuta este método

        System.out.println("La suma es " + (primerNum + segundoNum)); 

    }
    
    public static void numeros(int n1, int n2, int n3) { //Si ejecuto tres números en el main, se ejecuta este método

        System.out.println(n1 + n2 + n3);

    }

    public static void saludo(){

        System.out.println("Hola");

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

        numeros(num4, num6); //esta función funcionará sumando dos números

        numeros(num4, num5, num6); //esta función funcionará sumando tres números, es la segunda versión del método numeros
        
        //dos funciones pueden llamarse igual, pero las variables no

        saludo(); //no hace falta poner nada en el paréntesis porque
        // en el paréntesis la función no se le ha especificado que va a recibir nada

    }
    
}
