public class Apuntes4 {
    /*
     * TABLAS BIDIMENSIONALES / ARRAYS BIDIMENSIONALES / MATRICES
     */

    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4};
        String[] palabras = {"hola","adios"};

        //Opción 1: Crear una matriz rellena ya de números
        int[][] numerosMatrizA = {{4,3,9},{3,6,7},{9,7,5},{1,2,7}}; //Todos los array de dentro de los array tienen que ser del mismo tipo
                                                                   //Y la misma longitud de datos

        //Opción 2: crear la matriz vacía
        int[][] numerosMatrizB = new int[4][3]; //El primero es cuántos arrays, el segundo es cuántos datos tiene cada array

        numerosMatrizB[2][1] = 5; //Esto se meteria en el segundo 7

        //numerosMatrizA.length -> 4
        //numerosMatrizA.length -> 3

        //Imprime una matriz por consola

        for (int i = 0; i < numerosMatrizA.length; i++) {
            for (int j = 0; j < numerosMatrizA[0].length; j++) {
                System.out.print(numerosMatrizA[i][j]);
            }

            System.out.print(" ");
        }

    }
}
