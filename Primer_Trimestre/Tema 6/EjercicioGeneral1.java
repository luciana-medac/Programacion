public class EjercicioGeneral1 {

    /*
     * Al nombrar a un nuevo Papa, éste debe escoger un nombre de Papa (no utilizan
     * su nombre real), y asignarle un ordinal en función de cuántos Papas ha habido
     * ya con ese nombre en la historia.
     * 
     * Desarrolla un programa que pueda utilizar el Vaticano para permitirle a los
     * nuevas Papas elegir su nombre (si hay demasiados, puedes elegir 10). Para
     * ello, deberás mostrarle una lista con nombres disponibles y, cuando elija
     * uno, calcular cuál será su número ordinal. Por último, se mostrará el mensaje
     * oficial “Habemus Papam” seguido del nombre elegido.
     * 
     * Por ejemplo, si elegimos llamarnos Juan (y ya ha habido 23 papas que se han
     * llamado Juan) el programa mostrará por consola la frase:
     * "Habemus Papam: Juan 24)".
     * 
     * Después, el programa vuelve a dar a elegir un nuevo nombre de Papa, y así
     * indefinidamente
     

    public static void main(String[] args) {

        // CORRECIÓN
        
        String[] nombresPapas = { "Benito", "Juan Pablo", "Pablo", "Pío", "Benedicto", "Esteban", "Bonifacio", "Urbano",
                "Clemente", "Juan" };
        int[] numPapas = { 20, 3, 6, 7, 10, 24, 7, 8, 14, 28 };

        while (true) {

            System.out.println("Elija un nombre de Papa de entre los siguientes: ");
            for (int i = 0; i < numPapas.length; i++) {
                System.out.println("-" + nombresPapas[i]);
            }

            String nombreElegido = System.console().readLine("Su elección: ");

            // Se puede añadir una comprobación del nombre

            for (int i = 0; i < nombresPapas.length; i++) {
                if (nombresPapas[i].equalsIgnoreCase(nombreElegido)) { // el ignorecase es para que le de igual si pone
                                                                       // mayúscula o no, pero las tíldes tienen que coincidir

                    numPapas[i] += 1;
                    System.out.println("Habemus Papam: " + nombresPapas[i] + " " + numPapas[i] + "º");
                }
            }
        }
    }
    
*/
}
