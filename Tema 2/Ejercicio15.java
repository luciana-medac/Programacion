public class Ejercicio15 {

    /*
     * Desarrolla un programa que pregunte al usuario un número de minutos 
     * y muestre por consola cuántas horas y minutos son
     */

    public static void main(String[] args) {
        
        //Primero convierto y pregunto 
        int minutosUno = Integer.parseInt(System.console().readLine("Introduce los minutos "));

        //Calculos
        final int horas = 60;
        int resultado = minutosUno / horas;
        int minutosDos = minutosUno % horas;

        //Muestro resultados
        System.out.println(minutosUno + " son " + resultado + " horas y " + minutosDos + " min");

    }
    
}
