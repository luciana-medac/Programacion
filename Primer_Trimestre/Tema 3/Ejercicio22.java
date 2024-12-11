public class Ejercicio22 {

    /*
     * Desarrolla un programa que pregunte un saludo al usuario y le pregunte cuántas veces
     * quiero repetirlo. El programa repetirá el saludo tantas veces como el usuario
     * haya indicado
     */

    public static void main(String[] args) {
        
        String saludo = System.console().readLine("Introduce el saludo: ");

        int veces = Integer.parseInt(System.console().readLine("Cuántas veces quieres que se repita? "));

        for (int i = 0; i < veces; i++ ) {

            System.out.println(saludo);

        }

    }
    
}
