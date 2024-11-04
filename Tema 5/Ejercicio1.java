public class Ejercicio1 {

    /*
     * Dado un número que se le pasa por parámetro a una función,
     * esta debe imprimir todos los números desde el dado hasta el 0,
     * de forma recursiva
     * 
     * Recursividad: un método se invoca a sí mismo
     * (este tipo de ejercicio se pueden siempre hacer con
     * bucles o con recursividad, el desarrollador elige)
     */

        
        public static void cuentaAtrasRecursiva (int n) {

            if (n<=0) {
                System.out.println("Finalizó el método"); //si no tenemos esto, se haría de forma infinita
                                                            //asi que le ponemos una condición para que pare la recursividad
            } else {
                System.out.println(n); //imprime el método
                cuentaAtrasRecursiva(n-1); //le resta a n uno, entonces si por ejemplo se dice 25, 
                                            //imprime el 25 y resta uno, entra 24, se imprime 24, se resta uno
            }

        }
    public static void main(String[] args) {
        
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        cuentaAtrasRecursiva(numU);

    }
    

}