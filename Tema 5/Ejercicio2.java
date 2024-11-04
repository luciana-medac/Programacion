public class Ejercicio2 {

    /*
     * Dado un número que se le pasa un método
     * el método tiene que sumar todos los inferiores
     * este de forma recursiva suma todos los números inferiores a él (hasta el 0)
     */

    public static void sumaInferiores(int n) {

        int resultado = 0;

        if (n<=0) {
            System.out.println("Fin");
        } else {
            System.out.println(n);
            sumaInferiores(n - 1);
            if (n < resultado) {
                sumaInferiores(resultado + n);
            }
        }


    }
    
    public static void main(String[] args) {
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        sumaInferiores(numU);
    }
    
}
