public class Ejercicio3 {

    /*
     * Desarrolla un método
     * que reciba dos números enteros y calcule,
     * de forma recursiva
     * la potencia del primero elevado al segundo
     */
    
    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
            //no hay potencia() solo evita que se haga infinito
        } else {
            return a * potencia( a, b-1);
        }
    }

    public static void main(String[] args) {
        int base = Integer.parseInt(System.console().readLine());
        int exponente = Integer.parseInt(System.console().readLine());
        System.out.println(potencia(base, exponente)); //salida 8 (2^3)
    }

}

//que es una funcion recursivo
//esta bien porque no es infinito
//identificarla
