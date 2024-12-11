public class ahorcado {
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

            String[] palabrasAleatorias = { "manzana", "elefante", "computadora", "estrella", "océano", "montaña", "cielo", "flor",
            "libro", "sol", "luna", "árbol", "río", "nube", "dinosaurio", "puerta", "silla", "mesa", "teléfono", "coche"};

            int random = (int)(Math.random()*20);

            String palabra = palabrasAleatorias[random];

            char[] solucion = new char[palabra.length()];

            for (int i = 0; i < solucion.length; i++) {
                solucion[i] = '_';
            }
    
            char[] palabraArray = new char[palabra.length()];
    
            for (int i = 0; i < palabraArray.length; i++) {
                palabraArray[i] = palabra.charAt(i);
            }
            
            int resuelto = 0;
            int errores = 10;
    
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
                    } else if (cRespuesta != palabraArray[i]) {
                        
                        errores--;
                        switch (errores) {
                            case 9:
                                System.out.println("___");
                                break;
                            case 8: 
                                System.out.println("  _______");
                                System.out.println("  |");
                                System.out.println("  |");
                                System.out.println(" _|_ ");
                                break;
                            case 7:
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |");
                                System.out.println(" _|_ ");
                                break;
                            case 6:
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /");
                                System.out.println(" _|_ ");
                                break;
                            case 5:
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|");
                                System.out.println(" _|_ ");
                                break;
                            case 4:
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|/");
                                System.out.println(" _|_ ");
                                break;
                            case 3:
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|/");
                                System.out.println(" _|_  /");
                                break;
                            case 2:
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|/");
                                System.out.println(" _|_  //");
                                break;
                            case 1:
                                System.out.println("Estás muelto");
                                break;
                        }

                    }
                }
            }while(resuelto != palabra.length());

            System.out.println("Enhorabuena la palabra es: " + palabra);
        }

}}

   //  ______
   //  |     o
   //  |    /|\
   // _|_   / \

   /*
    * case 9:
                                System.out.println("O");
                                break;
                            case 8: 
                                System.out.println(" o");
                                System.out.println(" | ");
                                break;
                            case 7:
                                System.out.println("  O");
                                System.out.println( "/|");
                            case 6:
                                System.out.println(" O");
                                System.out.println("/|/");
                            case 5:
                                System.out.println(" O");
                                System.out.println("/|/");
                                System.out.println(" /");
                            case 4:
                                System.out.println(" O");
                                System.out.println("/|/");
                                System.out.println("//");
                            case 5: 
    */
