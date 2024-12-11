public class Ejercicio20 {

    /*
     * 
     * Programa que crea un array de 5x5 en las que todas las posiciones sean 0
     * 
     * Después haz que en una posicion aleatoria del array se coloque un 1. Muestra
     * la matriz por consola.
     * Mostrar el array por consola con el 1 incluido
     */
    
    public static void main(String[] args) {
        
        //Creamos el array

        int[][] ArrayZero = {
            {0 , 0 , 0 , 0 , 0},
            {0 , 0 , 0 , 0 , 0},
            {0 , 0 , 0 , 0 , 0},
            {0 , 0 , 0 , 0 , 0},
            {0 , 0 , 0 , 0 , 0}
        };

        for (int i = 0; i < ArrayZero.length; i++) {
            for (int j = 0; j < ArrayZero[0].length; j++) {
                System.out.print(ArrayZero[i][j] + " ");
            }
            System.out.println(" ");
        }

        //Si no fuera 5x5 y fuera 5x7 por ejemplo, se crean dos variables, 
        //como en este caso coincide, he hecho uno
        int numUno = (int)(Math.random()*5);

        ArrayZero[numUno][numUno] = 1;

        System.out.println("----------Matriz Modificada----------");

        for (int i = 0; i < ArrayZero.length; i++) {
            for (int j = 0; j < ArrayZero[0].length; j++) {
                System.out.print(ArrayZero[i][j] + " ");
            }

            System.out.println(" ");
        }
        
    }
}
