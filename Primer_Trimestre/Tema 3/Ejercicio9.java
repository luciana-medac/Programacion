public class Ejercicio9 {

    /*
     * Escribe un programa que pregunte el precio de un producto y si es de primera necesidad o no
     * y calcule su precio con IVA (teniendo en cuenta los productos de primera necesidad
     * tienen un 10% de IVA y el resto un 21%)
     */


    public static void main(String[] args) {
        
        //Primero hacemos la pregunta del producto
        Float precio = Float.parseFloat(System.console().readLine("¿Cuánto cuesta el producto? "));

        //Después si es un producto de primera necesidad o no
        String tipo = System.console().readLine("¿Es de primera necesidad o no? ");

        //Aplicamos los condicionales, con si y no, y hacemos la cuenta según la respuesta
        if (tipo.equals("si")) {

            precio = precio * 1.10f;
            System.out.println("En total con IVA includio sería: " + precio);
        }

        else if (tipo.equals("no")) {
            
            precio = precio * 1.20f;
            System.out.println("En total con IVA includio sería: " + precio);

        }

        else {

            System.out.println("No es un producto");

        }

    }
    
}
