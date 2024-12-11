public class Ejercicio5 {

    /*
     * Desarrolla un programa que pida por consola al usuario cuánto vale un billete de tren,
     * cuántos billetes necesita comprar
     * y muestre el dinero totoal que va a gastarse
     */

     public static void main(String[] args) {
        
        String precioBillete = System.console().readLine("¿Cuánto vale el billete? ");
        Float precioNum = Float.parseFloat(precioBillete);
        String compra = System.console().readLine("¿Cuántos billetes va a comprar? ");
        int compraNum = Integer.parseInt(compra);

        /*Otra forma de hacer directamente el cambio
         * float precioBillete = Float.parseFloat ( System.console().readLine(format:"¿Cuánto vale el billete?") );
         * 1. guardo la varibale  2. la convierto      3. pregunto por consola     
        */
        
        float total = precioNum * compraNum;

        System.out.println("En total todos los billetes costarían " + total + " euros");
     }
    
}
