public class Ejercicio18 {
    
    /*
     * Una tienda tiene una oferta que consiste en hacer un 10% de descuento a quienes compren 5 artículos. 
     * Para calcular el precio total a pagar te piden que desarrolles un programa que pregunte primero, 
     * uno a uno, 
     * el precio de los 5 artículos, 
     * y después muestre el precio total tras sumar los 5 y aplicar el descuento.
     */

    public static void main(String[] args) {
        
        //Primero convierto y pregunto por los articulos
        Float articuloUno = Float.parseFloat(System.console().readLine("Introducce el precio del primer articulo: "));
        Float articuloDos = Float.parseFloat(System.console().readLine("Introducce el precio del segundo articulo: "));
        Float articuloTres = Float.parseFloat(System.console().readLine("Introducce el precio del tercer articulo: "));
        Float articuloCuatro= Float.parseFloat(System.console().readLine("Introducce el precio del cuarto articulo: "));
        Float articuloCinco = Float.parseFloat(System.console().readLine("Introducce el precio del quinto articulo: "));

        //Hago las cuentas
        float totalUno = articuloUno + articuloDos + articuloTres + articuloCuatro + articuloCinco;
        float preciofinal = totalUno * 0.10f;

        //Muestro los resultados
        System.out.println("Precio con descuento realizado: " + preciofinal);

    }

}
