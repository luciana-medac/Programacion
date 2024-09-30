public class Ejercicio8 {

    /*
     * Tienda de banderas. El programa pide el ancho y alto de la bandera en cm
     * (se cobra a 2cents el cm2)
     * Se pregunta si se desea escudo bordado (2.5) y si se envía o se recoge (envio 5)
     * Se muestra el precio total
     */
    
    public static void main(String[] args) {
        
        Float ancho = Float.parseFloat(System.console().readLine("Indica el ancho de la bandera en cm "));

        Float alto = Float.parseFloat(System.console().readLine("Indica el alto de la bandera en cm "));

        float precioBandera = (ancho * alto) * 0.02f;
        float precio = precioBandera/100;

        System.out.println("Costará " + precio + " euros" );


        String bordado = System.console().readLine("¿Quieres escudo bordado? ");

            if (bordado.equals("si")) {

                float precioBor = precio + 2.5f;
                System.out.println(" El precio sería de " + precioBor + " euros");
            
            }

            else if (bordado.equals("no")) {
                System.out.println("El precio será de" + precio + " euros");
            }
        
        String envio = System.console().readLine("¿Envio o recogida? ")

            if (envio.equals("envio")) {

                float precioEn = precio + 5.0f;
                System.out.println("El precio total sería de" + precioEn);
                
            }



    }
}
