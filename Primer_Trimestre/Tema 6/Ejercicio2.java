public class Ejercicio2 {

    /*
     * Repetimos calcular nota media multiples notas, pero ahora
     * las notas van a un array (no sabemos cuántas son)
     * Devolvemos media
     */

    public static void main(String[] args) {
        
        int notas[];

        int longitud = Integer.parseInt(System.console().readLine("Cuántas notas vas a introducir? "));

        notas = new int[longitud];

        //Preguntar notas
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Integer.parseInt(System.console().readLine("Introduce una nota: "));
        }

        //Calcular media
        int suma = 0;
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            media = (float)suma / (float)longitud;
        }

        System.out.println("La media de tus notas es: " + media);

    }
    
}
