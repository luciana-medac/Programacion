public class Ejercicio2 {

    /*
     * Realiza un programa que pida una hora por teclado y que muestre "buenos días" , 
     * "buenas tardes" o "buenas noches" según la hora.
     * Se utilizaran los tramos de 6h - 12h buenos días, de 13h - 20h buenas tardes 
     * y de 21h a 5h buenas noches respectivamente. 
     * Sólo se tienen en cuenta las horas, no los minutos
     */

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Dime la hora "));

        if (numero >= 6 && numero < 12) {

            System.out.println("Buenos días");

        }

        else if (numero >= 12 && numero < 20) {
            
            System.out.println("Buenas tardes");

        }

        else {

            System.out.println("Buenas noches");

        }

    }
    
}
