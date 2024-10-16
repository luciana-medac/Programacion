public class Ejercicio36 {

    /*
     * Programa que te pide una cantidad inicial de una inversión,
     * el interés anual y el número de años, y te devuelve la cantidad ganada cada año.
     * (Por ejemplo, un 10% de beneficio pero siempre con respecto a la cantidad que tienes
     * del año anterior)
     * 1000€
     * 10 años
     * 5%
     * 
     * Año 1: 1000
     * Año 2: 1050
     * Año 3: 1102, 50
     */

    public static void main(String[] args) {
        
        Float cantidad = Float.parseFloat(System.console().readLine("Introduce la cantidad inicial: "));

        Float porciento = Float.parseFloat(System.console().readLine("Introduce el interes anual: "));

        Float ano = Float.parseFloat(System.console().readLine("Introduce los años: "));

        float total = (float)cantidad;

        for (int i = 1; i < ano; i++) {

            total = total + (total * porciento) /100f;
            System.out.println("Has ganado en el año " + i + " un total de " + total);

        }

    }
    
}
