public class Ejercicio3 {

    /* Desarrolla un programa que sirva a un cajero/a de una tienda. Debe hacer lo siguiente:
     * Preguntar cuánto vale el producto
     * Preguntar cuánto dinero entrega el cliente
     * Indicar cuánto debe devolver
     */
    

     public static void main(String[] args) {
        
        String producto = System.console().readLine("Cuánto vale el producto: ");
        int productoNum = Integer.parseInt(producto);
        String dineroCliente = System.console().readLine("Cuánto entrega: ");
        int dineroClienteNum = Integer.parseInt(dineroCliente);

        int vuelta = productoNum - dineroClienteNum;

        System.out.println("Debe devolver " + vuelta);

     }


}
