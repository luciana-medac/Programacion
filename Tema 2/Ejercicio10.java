public class Ejercicio10 {
    
    /*Programa que te pide el precio de un producto
    * y le añade el IVA
    */

    public static void main(String[] args) {
        
        //Convertir y preguntar
        Float producto = Float.parseFloat(System.console().readLine("¿Cuánto vale el producto? "));

        //Calcular
        final float iva = 1.21f; //la f sirve para números decimales
        float resultado = producto * iva;



        //Muestro el resultado
        System.out.println("El precio total del producto con IVA incluido es " + resultado);

    }

}
