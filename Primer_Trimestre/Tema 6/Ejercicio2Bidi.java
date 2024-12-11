public class Ejercicio2Bidi {

    /*
     * Programa asignaturas:
     * 
     * Durante un curso escolar, un alumno de Medac se examina de cada asignatura
     * una vez en cada trimestre, por lo que acaba teniendo 3 notas de cada asignatura
     * 
     * Desarrolla un programa que pida al alumno sus tres notas de cada una de las asignaturas
     * y devuelva:
     * 
     * - La nota final de cada asignatura (la media de las 3)
     * - La nota media final del curso (media de todas las asignaturas)
     * [podéis simplificar a 4 o 5 asignaturas]
     */

    public static void main(String[] args) {
        
        //Un array bidimensional para 4 asignaturas con 3 notas cada una
        int[][] asignatura = new int[4][3];
        //un array String que contenga los nombres de las asignaturas
        String[] asig = {"bases", "programacion", "sistemas","entornos"};

        //Un bucle que pregunte y guarde las notas que se van introduciendo
        for (int i = 0; i < asignatura.length; i++) {
            for (int j = 0; j < asignatura[0].length; j++) {
                asignatura[i][j] = Integer.parseInt(System.console().readLine("Introduce una nota de " + asig[i] + ": "));
            }
        }

        //Un array que vaya a guardar la media de las notas de cada asignatura (la media de programacion, la media de bases, etc)
        int[] media = new int[4];

        //Un bucle que guarde en el array, la media de cada asignatura
        /* for (int i = 0; i < asignatura.length; i++) {
            for (int j = 0; j < asignatura[0].length; j++) {
                media[i] = (asignatura[i][0] + asignatura[i][1] + asignatura[i][2])/3;
            }
        } */
       
        //Un bucle que guarde en el array, la media de cada asignatura
        for (int i = 0; i < asignatura.length; i++) {
            for (int j = 0; j < asignatura[0].length; j++) {
                media[i] += asignatura[i][j];
            }
            media [i] = media [i]/3;
        }

        //Mostrar la media de cada asignatura
        for (int i = 0; i < media.length; i++) {
            System.out.println("La media de " + asig[i] + " es " + media[i]);
        }

        //Variable que guarde la suma de las notas
        int totalMedia = 0;
        

        //Bucle para ir guardando la suma de las medias (6+5+7 = 18 (el 18 se guarda en la variable))
        for (int i = 0; i < media.length; i++) {
            totalMedia += media[i];
        }

        //Dividimos entre las asignaturas que haya
        totalMedia = totalMedia/4;
        //Se muestra la nota final
        System.out.println("La nota final es " + totalMedia);
    }
}
