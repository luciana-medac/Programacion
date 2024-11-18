public class Ejercicio15 {
    /*
     * Desarrolla una versión simplificada del ahorcado, en la que siempre se jugará
     * con la misma palabra. Elige una palabra y crea un array
     * guardando en cada posición una letra de la palabra.
     * Tu programa debe mostrar por consola un símbolo '_' por cada letra, y pedir
     * al usuario que introduzca una letra.
     * Si dicha letra está en la palabra, la mostrará (sustituirá el '_' por la
     * letra).
     * El programa repetirá la pregunta hasta que el usuario averigüe la palabra al
     * completo,
     * momento en el que le dará la enhorabuena y finalizará el programa.
     */

    public static void main(String[] args) {

        String palabra = "paloma";
        char[] solucion = {'_','_','_','_','_','_'};

        char[] palabraArray = new char[palabra.length()];

        for (int i = 0; i < palabraArray.length; i++) {
            palabraArray[i] = palabra.charAt(i);
        }
        

        int resuelto = 0;

        do{
            for (int i = 0; i < solucion.length; i++) {
                System.out.print(solucion[i] + " ");
            }
            System.out.println();
            System.out.println("====================");
            String sRespuesta = (System.console().readLine("Introduce tu letra: "));
            char cRespuesta = sRespuesta.charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if(cRespuesta == palabraArray[i]){
                    solucion[i] = cRespuesta;
                    resuelto++;
                }
            }
        }while(resuelto != palabra.length() + 1);
    }
}