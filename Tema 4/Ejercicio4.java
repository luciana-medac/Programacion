public class Ejercicio4 {

    /*
     * Desarrolla un programa qe pida al usuario el precio de un producto y
     * llame a un método para que calcule el precio con IVA
     * 
     * Ten en cuenta que el IVA, dependiendo del producto, puede ser el 0%,
     * el 5%, 10% o el 21%. Haz sobrecarga de métodos para que se pueda
     * invocar a la función de dos formas:
     * - Pasándole el precio y el IVA, y el método calcula el precio total
     * - Pasándole solo el precio, y entonces considera un IVA estándar del 21%
     * para calcular el total
     */

    public void producto(int precio) {

        System.out.println(precio*1.20);

    }  

    public static void producto(int precio, int ivaNum) {

        System.out.println(precio+ (precio*ivaNum/100));

    }

    public static void main(String[] args) {
       
        int precio = Integer.parseInt(System.console().readLine("Introduce el precio: "));
        String iva = System.console().readLine("Deseas Introducir IVA (1) o utilizamos el IVA por defecto (2)? ");

        switch (iva) {
            case "1":
                //Pedimos el IVA al usuario
                int ivaNum = Integer.parseInt(System.console().readLine("Introduce el IVA: "));
                //Llamamos al método que solo pide precio
                producto(precio, ivaNum);
                
                break;
            case "2":
                //No pedimos IVA
                //Llamamos al método que solo pide precio
                producto(precio);
                break;
            default:
                break;
        }

    }
    
}
