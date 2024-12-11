public class Ejercicio32 {

    /*
     * Programa que pinta por consola un cuadrado de asteriscos
     * de lado n (lo introduce el usuario)
     *  ***
     *  ***
     *  ***
     */
    
    public static void main(String[] args) {
        
        int lado = Integer.parseInt(System.console().readLine("Introduce la medida del lado: "));


        for (int i = 0; i < lado; i++ ){
            for (int j = 0; j < lado-1; j++ ) {

            System.out.print("*");
            }

            System.out.println("*");
        }


    }

}
