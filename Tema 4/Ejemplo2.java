public class Ejemplo2 {

    /*
     * Desarrolla un programa que pida un número al usuario
     * e imprima "hola" el número de veces que el usuario haya dicho
     * En el main se pide el número y se le pasa a un método
     * 
     * El método imprime hola las veces que se le hayan especificado
     */


    public static void saludo(int numeroR) {

        for (int i = 0; i < numeroR; i++ ) {

            System.out.println("Hola");

        }

    }

    public static void main(String[] args) {
        
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        saludo(numU);
    }
    
}
