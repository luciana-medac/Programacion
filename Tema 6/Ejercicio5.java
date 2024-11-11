public class Ejercicio5 {

    /*
     * Escribe un programa que muestre por pantalla una array de 
     * 10 números enteros, generados al azar entre 0 y 100
     * 
     * A continuación, el programa debe pedir un número al usuario
     * 
     * El programa debe comprobar si el número introducido
     * se encuentra dentro del array
     */

    public static void main(String[] args) {
        
        int numR = 0;
        int numUsuario = 0;
        
        int[] azar = new int[10];
        
        for (int i = 0; i < azar.length; i++) {
            azar[i] = (int)(Math.random()*101);
            System.out.println(azar[i]);

        }

        numUsuario = Integer.parseInt(System.console().readLine("Introduce un número: "));
        int contar = 0; //0 es que no, 1 es que si

        for (int i = 0; i < azar.length; i++) {
            if (azar[i] == numUsuario ) {
                contar = 1;
                break;
            }
        }

        if (contar == 1) {
            System.out.println("encontrado");
        } else {
            System.out.println("no encontrado");
        }
    }  
}
