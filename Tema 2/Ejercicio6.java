public class Ejercicio6 {

    /*
     * Conversor de días a horas 
     * (el usuario introduce un número de días y el programa 
     * muestra cuántas horas son)
     */

    public static void main(String[] args) {
        
        Float dias = Float.parseFloat( System.console().readLine("Introduce el número de días "));

        float horasTotales = dias * 24;

        System.out.println("Son el total estas horas: " + horasTotales);

    }
    
}
