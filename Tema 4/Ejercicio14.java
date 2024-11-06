public class Ejercicio14 {

    /*
     *  Desarrolla un programa que pregunte 5 números al usuario y se los pase a un método que se 
     *  encarga de indicar cuál es el mayor. El método comprobará cuál es mayor y lo imprimirá 
     *  directamente por consola,
     *  mostrando la frase "el número mayor es ...".
     */
    
    public static void comprobarMayor (int n1, int n2, int n3, int n4, int n5) {

        //También se puede hacer creando una variable
        
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
            System.out.println("El número mayor es: " + n1);
        } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
            System.out.println("El mayor es: " + n2);            
        } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
            System.out.println("El número mayor es: " + n3);
        } else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
            System.out.println("El número mayor es: " + n3);
        } else if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
            System.out.println("El número mayor es: " + n5);
        }
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(System.console().readLine("Introduce el primer número: "));
        int num2 = Integer.parseInt(System.console().readLine("Introduce el segundo número: "));
        int num3 = Integer.parseInt(System.console().readLine("Introduce el tecer número: "));
        int num4 = Integer.parseInt(System.console().readLine("Introduce el cuarto número: "));
        int num5 = Integer.parseInt(System.console().readLine("Introduce el quinto número: "));

        comprobarMayor(num1, num2, num3, num4, num5);
    }
    
}
