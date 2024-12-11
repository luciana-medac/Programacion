public class Ejercicio17 {

    /*
     * Desarrolla un programa que pida al usuario que introduzca la cantidad de litros de gasolina 
     * que caben en el depósito de su coche, 
     * y la cantidad de kilómetros que ha recorrido. 
     * Luego, calcula e imprime el consumo medio en litros por cada 100 km.
     */

    public static void main(String[] args) {
        
        //Convierto y pregunto
        Float cocheGas = Float.parseFloat(System.console().readLine("¿Cuántos litros de gasolina caben en el coche? "));
        Float distancia = Float.parseFloat(System.console().readLine("¿Cuántos kilómetros ha recorrido? "));

        //Hacemos el calculo
        float media = (cocheGas * 100)/distancia;

        //Muestro los resultados
        System.out.println("El consumo medio es de: " + media);

    }
    
}
