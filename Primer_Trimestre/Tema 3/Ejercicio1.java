public class Ejercicio1 {

    /*
     * Realiza un programa para la entrada de una discoteca, que pregunte la edad 
     * e imprima por pantalla si puedes      
     * entrar o no en función de si eres mayor de edad o no
     */

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Introduce tu edad: "));

        if (numero >= 18) {
            
            System.out.println("Puedes pasar");

        }

        else {

            System.out.println("No puedes pasar");

        }


    }
    
}
