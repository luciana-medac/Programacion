public class Ejercicio37 {

    /*
     * Programa que pide un número y devuelve su factorial (la operación matemática conocida como 'factorial' 
     * es el resultado de dividir un número por todos los números menores que él, excepto el 0. Es decir, el 
     * factorial del 5 por ejemplo sería el resultado de 5*4*3*2*1)
     */

    public static void main(String[] args) {
        
        int num = Integer.parseInt(System.console().readLine("Introduce un número: "));

        
        for (int i = num - 1; i > 0; i--) {

            num = num * i;
            

        }
    
        System.out.println("El total es: " + num);
    
    }
    
}
