public class Ejercicio17 {

    /*
     * Supongamos que se consideran números de la suerte los números: 0,1,2,5,7,
     * y números de la mala suerte: 3,4,6,8,9. Desarrolla un programa que,
     * dado un número introducido por el usuario,
     * diga si da buena suerte o no, en función de si tiene más números de
     * buena suerte o de mala suerte.
     */

    public static void main(String[] args) {

        String[] numSuerte = { "0", "1", "2", "5", "7" };
        String[] numNoSuerte = { "3", "4", "6", "8", "9" };

        String numU = System.console().readLine("Introduce un número: ");

        for (int i = 0; i < numNoSuerte.length; i++) {

            if (numU.equals(numSuerte[i])) {
                System.out.println("Es un número de la suerte");
                break;
            } else if (numU.equals(numNoSuerte[i])) {
                System.out.println("No es un número de la suerte");
                break;
            }
        }

    }

}
