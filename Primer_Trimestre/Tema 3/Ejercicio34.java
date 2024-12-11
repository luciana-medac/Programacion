public class Ejercicio34 {

    /*
     * Pide al usuario que introduzca caracteres uno por uno
     * y cuenta cuántas vocales ha introducido.
     * El bucle termina cuando el usuario introduce un 0
     */

    public static void main(String[] args) {
        
        String letra;
        int numVoca = 0;
        int numCons = 0;

        //while (!letra.equals(anObject: "0")) --> mientras sea diferente de cero, haz tal
        do {

            letra = System.console().readLine("Introduce una letra: ");

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ) {

                numVoca = numVoca + 1; //numVoca++ (esto solo se pone cuando es ++); numVoca=+;
                
            }

            else if (letra.equals("0")) {
                System.out.println("Fin del programa");
            }

            else {

                numCons = numCons + 1;

            }


        } while ( !letra.equals("0"));

        System.out.println("El total de consonantes: " + numCons + " El total de vocales: " + numVoca);

    }
    
}
