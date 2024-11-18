public class jueguito {

    /*Desarrolla una versión simplificada del ahorcado, en la que siempre se jugará
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

            //Aquí se guardan las palabras que se pueden adivinar
            String[] palabrasAleatorias = { "manzana", "elefante", "computadora", "estrella", "océano", "montaña", "cielo", "flor",
            "libro", "sol", "luna", "árbol", "río", "nube", "dinosaurio", "puerta", "silla", "mesa", "teléfono", "coche"};

            //Aquí guarda un número random del 0 al 20
            int random = (int)(Math.random()*21);

            //Ahora en la variable palabra guardamos una palabra del Array, usando el número random para que nos de la posición
            //de una de las palabras
            String palabra = palabrasAleatorias[random];
            System.out.println(palabra);

            //Creamos un char con la longitud de la palabra que se vaya a generar
            char[] solucion = new char[palabra.length()];

            //Rellenamos el array solucion con la longitud del String palabra
            for (int i = 0; i < solucion.length; i++) {
                solucion[i] = '_';
            }
            
            //creamos un array con la longitud de la palabra
            char[] palabraArray = new char[palabra.length()];
            //Guardamos esa palabra pero por caracteres (si es rio, se guardaría como {'r','i','o'})
            for (int i = 0; i < palabraArray.length; i++) {
                palabraArray[i] = palabra.charAt(i);
            }

            //Esta variable la usamos para contar las veces que ha introducido una letra
            int resuelto = 0;
            //Usamos esta variable para contar cuando introduce una letra equivocada
            int errores = 10;
            
            //Do While para que me diga la pregunta una vez y continue mientras que el int resuelto
            //sea diferente a la longitud del String palabra
            do{
                    //Mostramos el array solucion _ _ _ _ para saber cuántas letras vamos a introducir
                    for (int i = 0; i < solucion.length; i++) {
                        System.out.print(solucion[i] + " ");
                    }
                
                System.out.println();
                System.out.println("====================");

                //Preguntamos la letra
                String sRespuesta = (System.console().readLine("Introduce tu letra: "));
                
                //me guardo la letra en la variable char respuesta, sacando el caracter de la posición 0
                char cRespuesta = sRespuesta.charAt(0);

                    //Un bucle para que vaya comprobando la palabra
                    for (int i = 0; i < palabra.length(); i++) {

                        if(cRespuesta == palabraArray[i]){      //Si el caracter introducido es igual un caracter del arrayPalabra
                            solucion[i] = cRespuesta;           //Intercambia '_' por el caracter que ha introducido el usuario
                            resuelto++;                         //Le sumamos uno al contador de resuelto
                        } 
                        
                        if (cRespuesta != palabraArray[i]) { //Si el caracter introducido es diferente a un caracter del arrayPalabra

                            errores -= 1; //Se le resta al contador errores (hay 10 intentos)
                            System.out.println(errores);

                            //Muestra el siguiente dibujo
                            if (errores == 9) {
                                System.out.println("___");
                                break;
                            } else if (errores == 8) {
                                System.out.println("  _______");
                                System.out.println("  |");
                                System.out.println("  |");
                                System.out.println(" _|_ ");
                                break;
                            } else if (errores == 7) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |");
                                System.out.println(" _|_ ");
                                break;
                            } else if (errores == 6) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /");
                                System.out.println(" _|_ ");
                                break;
                            } else if (errores == 5) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /");
                                System.out.println(" _|_ ");
                                break;
                            } else if (errores == 4) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|");
                                System.out.println(" _|_ ");
                                break;
                            } else if (errores == 3) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|/");
                                System.out.println(" _|_ ");
                                break;
                            } else if (errores == 2) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|/");
                                System.out.println(" _|_  /");
                                break;
                            } else if (errores == 1) {
                                System.out.println("  _______");
                                System.out.println("  |    O");
                                System.out.println("  |   /|/");
                                System.out.println(" _|_  //");
                                System.out.println();
                                System.out.println("Tas muelto");
                                break;
                        }
                    }
                }
            }while(resuelto != palabra.length() || errores == 0); //Se repite el bucle mientras el contador sea diferente a la longitud del String palabra

            System.out.println("Enhorabuena la palabra es: " + palabra); //Si termina el bucle muestra que ha respondido correctamente
        }
    }

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
    
} */
