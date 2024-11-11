public class Ejercicio1 {

    /*
     * Crea un array con todas tus asignaturas e imprímela
     */

    public static void main(String[] args) {
        
        String[] asignaturas = new String[8];

        asignaturas[0] = "Programación";
        asignaturas[1] = "Base de datos";
        asignaturas[2] = "Sostenibilidad";
        asignaturas[3] = "Digitalización";
        asignaturas[4] = "Sistemas Informáticos";
        asignaturas[5] = "Lenguaje de Marcas";
        asignaturas[6] = "IPE";
        asignaturas[7] = "Entornos de Desarrollo";

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println( asignaturas[i] );
        }

    }
    
}
