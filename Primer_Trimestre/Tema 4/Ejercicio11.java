public class Ejercicio11 {

    /*
     * Desarrolla un programa que pida por consola 5 datos de temperatura por un supuesto sensor en una máquina
     * 
     * Se desea comprobar si alguno de los 5 datos es atípico, es decir, si se aleja más de 3 grados de la media.
     * 
     * Para ello:
     * Se le pasarán los 5 datos a un método llamado valoresAtipicos, que primero invocará a otro para que haga la media y se la devuelva 
     * y después imprima por consola los valores que son atípicos
     * 
     * Al finalizar, se debe imprimir cuántos valores atípicos se han encontrado
     * 
     * 30
     * 32
     * 27
     * 29
     * 38
     * 
     * Media: 31,2
     * Valores atípicos (3 grados):
     * 27
     * 38
     * Hay un total de 2 valores atípicos
     */


    public static float media(int n1, int n2, int n3, int n4, int n5) {
        float media = (n1 + n2 + n3 + n4 + n5)/5;
        return media;
    }

    public static void valoresAtipicos(int n1, int n2, int n3, int n4, int n5){
        float media = media(n1, n2, n3, n4, n5);
        int valores = 0;

        if (n1 + 3 < media || n1 - 3 > media) {
            System.out.println(n1);
            valores ++;
        } if (n2 + 3 < media || n2 - 3 > media) {
            System.out.println(n2);
            valores ++;
        } if (n3 + 3 < media || n3 - 3 > media) {
            System.out.println(n3);
            valores ++;
        } if (n4 + 3 < media || n4 - 3 > media) {
            System.out.println(n4);
            valores ++;
        } if (n5 + 3 < media || n5 - 3 > media) {
            System.out.println(n5);
            valores ++;
        }

        System.out.println( "La media es: " + media);
        System.out.println("Hay un total de " + valores + " atípicos");

    }
    public static void main(String[] args) {
        int numUno = Integer.parseInt(System.console().readLine("Introduce el primer número: "));
        int numDos = Integer.parseInt(System.console().readLine("Introduce el segundo número: "));
        int numTres = Integer.parseInt(System.console().readLine("Introduce el tercer número: "));
        int numCuatro = Integer.parseInt(System.console().readLine("Introduce el cuarto número: "));
        int numCinco = Integer.parseInt(System.console().readLine("Introduce el quinto número:"));

        valoresAtipicos(numUno, numDos, numTres, numCuatro, numCinco);
    }
    
}
