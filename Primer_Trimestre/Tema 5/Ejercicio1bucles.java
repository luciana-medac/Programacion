public class Ejercicio1bucles {

    public static void imprimirNumeros (int n) {

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        
        int numU = Integer.parseInt(System.console().readLine("Introduce un número"));

        imprimirNumeros(numU);

    }
    
}
