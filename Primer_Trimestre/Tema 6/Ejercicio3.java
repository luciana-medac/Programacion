public class Ejercicio3 {

    /*
     * Pregunta al usuario cuántas cosas tiene que comprar
     * Crea un array con esa longitud y ve preguntando uno a uno todos los alimentos que tiene
     * que comprar hasta rellenar el array completo
     * 
     * Cuando acabe imprime la lista de la compra por pantalla
     * 
     * Articulo 1: pan
     */

    public static void main(String[] args) {
        
        String articulo[];

        int numA = Integer.parseInt(System.console().readLine("Introduce el número de articulos a comprar: "));

        articulo = new String[numA];

    
        for (int i = 0; i < articulo.length; i++) {
            articulo[i] = System.console().readLine("Introduce el artículo: ");
        }

        for (int i = 0; i < articulo.length; i++) {
            System.out.println("Articulo " + (i+1) + ": " + articulo[i] );
        }

    }
    
}
