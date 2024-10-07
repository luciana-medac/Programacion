public class Ejercicio23 {

    /*
     * Programa que te pregunte tu edad y te dice todos los años que has cumplido desde que naciste
     * (desde 1 hasta la edad que tienes ahora)
     */
    
    public static void main(String[] args) {
        
        int edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));

        for (int i = 1; i <=edad; i++ ){

            System.out.println("Has cumplido este año " + i);

        }

    }
    
}
