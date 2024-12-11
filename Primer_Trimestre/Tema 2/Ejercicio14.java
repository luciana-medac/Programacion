public class Ejercicio14 {

    /*
     * Desarrolla un conversor de grados Celsius a grados kelvin
     */

    public static void main(String[] args) {
        
        //Convierto y pregunto
        int celsius = Integer.parseInt(System.console().readLine("Ingresa los Calsius que quieres convertir "));

        //hago el cálculo 
        final int kelvin = 273;
        int total = celsius + kelvin;

        //Muestro los resultados
        System.out.println("Los grados Kelvin son: " + total);

    }
    
}
