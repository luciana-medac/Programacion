public class Ejercicio20 {

    /*
     * Desarrolla un programa que pregunte al usuario un número y muestre por consola la tabla
     * de multipicar de ese número (simplifica tu codigo usando un bucle)
     */

    public static void main(String[] args) {
        
        int numUsuario = Integer.parseInt(System.console().readLine("Introduce un número: "));

        
        for (int i=0; i<11; i++){
            
            System.out.println( numUsuario + " x " + i + " = " + numUsuario * i);

        }

    }
    
}
