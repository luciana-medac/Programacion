public class Ejercicio10 {

    /*
     * Programa que comprueba si un número de la lotería es uno de los premiados o no
     * 
     * El programa pide al usuario su número, y se lo pasa a un método que tiene guardados en variables
     * los 3 números premiados
     * El método comprueba si está premiado o no (si coincide o no con alguno de los 3 guardados)
     * y devuelve al main la frase "premiado!!" o "no ha habido suerte"
     * 
     * El main muestra la frase por consola
     */

    public static String comprobacion(int n){

        int numPre1 = 05444;
        int numPre2 = 44757;
        int numPre3 = 14004;
        int numPre4 = 00183; //Java lo reconoce como un 183 entonces podemos hacer un String y usar el equals en el if
                             //Lo considero un número si necesito matematicas, si no, lo considero un String
        String frase = " ";
        if (n == numPre1 || n == numPre2 || n == numPre3) {
            frase = "PREMIO!!";
        } else {
            frase = "no ha habido suerte";
        }

        return frase;

    }

    public static void main(String[] args) {
        int numU = Integer.parseInt(System.console().readLine("Introduce tu número de lotería: "));
        System.out.println(comprobacion(numU));
    }
    
}
