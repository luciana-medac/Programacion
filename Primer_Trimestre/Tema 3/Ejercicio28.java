public class Ejercicio28 {

    /*
     * Un bucle imprime todos los número del 0 al 100
     * excepto el que diga el usuario
     */

    public static void main(String[] args) {
        
        int num = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = 0; i <= 100; i++){


            if (num == i) {

                continue; //Se salta esta repeteción del bucle y sigue con las siguiente (no rompe el bucle)
                
            }

            else {

                System.out.println(i);

            }

        }

    }
    
}
