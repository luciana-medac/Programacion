public class Ejercicio27 {

    /*
     * Un bucle pretende imprimir todos los números del 0 al 100.
     * Pero se interrumpe en el número que le diga el usuario
     */

    public static void main(String[] args) {
        
        
        int num =  Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = 0; i <= 100; i++){

            System.out.println(i);

            if (num == i) {

                break;
                
            }

            else {

                System.out.println(i);

            }

        }
    }
    
}

