package Practicas;
public class Practica8 {
    
    /* Tienda de banderas. El programa pide el ancho y alto de la bandera en cm
     * (se cobra a 2cents el cm2)
     * Se pregunta si se desea escudo bordado (2.5) y si se envía o se recoge (envio 5)
     * Se muestra el precio total
     * 
     */

    public static void main(String[] args) {
        
        //Primero preguntamos el ancho y el alto de la bandera
        Float ancho = Float.parseFloat(System.console().readLine("Introduce el ancho de la bandera en cm: "));

        Float alto = Float.parseFloat(System.console().readLine("Introduce el alto de la bandera en cm: "));

        //Calculamos los cm2 de la bandera
        float area = ancho * alto;

        //Después cálculamos cuánto costaría en céntimos
        float precio = area * 0.02f;

        //Pasamos los céntimos a auros
        precio = precio/100;

        //Preguntamos si se desea un escudo bordado
        String escudo = System.console().readLine("¿Desea que le bordemos un escudo? ");

        if (escudo.equals("si")) {

            precio = precio + 2.5f;
            
        }

        String envio = System.console().readLine("¿Desea que se lo envíemos a su domicilio? ");

        if (envio.equals("si")) {
            
            precio = precio + 5;

        }

        System.out.println("El precio final sería de: " + precio + " euros");


    }

}
