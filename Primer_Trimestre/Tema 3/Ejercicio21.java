public class Ejercicio21 {

    /*
     * Desarrolla un programa que muestre los números desde el que diga el usuario hasta el 0 (contando hacia atrás)
     */

    public static void main(String[] args) {
        
        int pregunta = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = pregunta; i> 0; i= i-1) {

            System.out.println(i);
            
        }

    }
    
}
