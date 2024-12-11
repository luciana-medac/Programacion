public class Ejercicio2Correcto {

    public static int sumaInferiores (int n){
        if (n<=0) {
            return 0;
        }
        return (n) + sumaInferiores(n - 1);
        // 4 + (3 + (2 + (1)))
    }

    public static void main(String[] args) {
        int numU = Integer.parseInt(System.console().readLine("Introduce un número "));
        System.out.println(sumaInferiores(numU));
    }
    
}
