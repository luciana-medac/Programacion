import java.nio.channels.Pipe.SourceChannel;

public class Apuntes2 {

    public static void main(String[] args) {
        

        
        int [] notas = new int[8];
        //Para guardar datos en el array
        notas[0] = 19;
        notas [1] = 22;
        //Se guarda en la posición dos del array un número que introduzca un usuario
        notas [2] = Integer.parseInt(System.console().readLine());

        System.out.println(notas[2]);

        //Creamos el array
        int[] notas1;
        //Preguntamos la longitud que tendrá el array en cuanto a datos
        int longitud = Integer.parseInt(System.console().readLine("Cuántos datos vas a introducir? "));
        //Se crean las posiciones con la longitud que nos da el usuario
        notas1 = new int [ longitud ];

        int[] notas3 = new int[5];

        notas3[0] = 3;
        notas3[1] = 4;
        notas3[2] = 5;
        notas3[3] = 6;
        //Así hasta el 5

        //Imprimir todos los valores
        for (int i = 0; i < notas3.length; i++) {
            System.out.println( "Posición " + i + ": " + notas3[i]);
        }

    }
    
}
