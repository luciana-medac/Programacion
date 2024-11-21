import java.lang.reflect.Array;

public class Ejercicio19 {

    /*
     * Crea un array en forma de matriz de 10x10 que represente (de forma
     * simplificada) una imagen
     * Supongamos que los píxeles sólo pudieran ser:
     * - rojos 1
     * - verdes 2
     * - azules 3
     * 
     * Para simular la imagen, haz que se rellene aleatoriamente con estos valores.
     * Muestra por pantalla la imagen en forma de matriz
     * 
     * Cuando de aplica un filtro a la imagen, lo que se hace realmente es modificar
     * los valores
     * de cada pixel dentro de la matriz. Supongamos que un filtro que consiste en
     * eliminar los
     * tonos rojos para crear una imagen con efecto azulado. Haz que el programa
     * sustituya todos los rojos (1) por
     * azules (3). Vuelve a mostrar la matriz para ver cómo ha quedado.
     */


    public static void main(String[] args) {

        //Creamos el array bidimensional de 10x10
        int[][] ArrayColores = new int[10][10];

        //Rellenamos el array con números aleatorios
        for (int i = 0; i < ArrayColores.length; i++) {
            for (int j = 0; j < ArrayColores[0].length; j++) {
                ArrayColores[i][j] = (int)(Math.random()*3)+1;
            }
        }

        //Mostramos el array
        for (int i = 0; i < ArrayColores.length; i++) {
            for (int j = 0; j < ArrayColores[0].length; j++) {
                System.out.print(ArrayColores[i][j] + " ");
            }
            System.out.println(" ");
        }

        //Reemplazamos el color rojo (1) por el azul (3)
        for (int i = 0; i < ArrayColores.length; i++) {
            for (int j = 0; j < ArrayColores[0].length; j++) {
                if (ArrayColores[i][j] == 1) {
                    ArrayColores[i][j] = 3;
                }
            }
        }

        System.out.println("----------FILTRO APLICADO----------");

        //Mostramos el cambio
        for (int i = 0; i < ArrayColores.length; i++) {
            for (int j = 0; j < ArrayColores[0].length; j++) {
                System.out.print(ArrayColores[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    
}
