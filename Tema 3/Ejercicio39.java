public class Ejercicio39 {

    /*
     * Crea un programa que pregunte al usuario si quiere apagar el sistema con la pregunta "¿Seguro que quieres apagar el sistema? (s/n)". Usa un bucle para seguir pidiendo al usuario la respuesta repetidamente.

    Si introduce una 's', se acaba el programa.
    Si introduce una 'n' se muestra el mensaje 'el programa continua...' y sigue preguntando.
    Si introduce cualquier otra cosa se muestra el mensaje 'respuesta no válida' y sigue preguntando.
     */

    public static void main(String[] args) {
       
        String pregunta = "" ;

        while (true) {

            pregunta = System.console().readLine("Seguro que quieres apagar el sistema? (s/n)");

            if (pregunta.equals("s")) {

                System.out.println("Saliendo...");
                break;
                
            }

            else if (pregunta.equals("n")) {

                System.out.println("Continuamos...");
                
            }

            else {

                System.out.println("Respuesta no válida");

            }
            
        }

    }
    
}
