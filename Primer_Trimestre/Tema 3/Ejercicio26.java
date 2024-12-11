public class Ejercicio26 {

    /*
     * Programa que te pide una contraseña y te dice si has acertado. Tienes 3 intentos.
     * Si te equivocas pasa al segundo intento y su finalizas los intentos se acaba el programa.
     * Si aciertas, te dice que has acertado y ya no te pregunta más
     */

    public static void main(String[] args) {
        
        String contra = "programacion";

        String pregunta = " ";

        for(int i=0; i<3; i++){

            pregunta = System.console().readLine("Introduce la contraseña: ");

            if (contra.equals(pregunta)) {
                    System.out.println("Has acertado");
                    break;
            }

            else {
                System.out.println("Incorrecto");
            }

        }

    }
    
}
