public class Apuntes {

    //Estructura de almacenamiento: arrays

    public static void main(String[] args) {
        
                    //La posición del dato empieza a contar desde cero, es decir, el 6 tendría la posición 0 (0-6)
        int[] notas = {6, 4, 7, 5, 8, 3, 10}; // Array de int de longitud 7 (posiciones 0-6)

        //Consultar un valor
        System.out.println( notas[0] );

        //Para imrpimir todo el array
        for (int i = 0; i <= 6; i++){
            System.out.println(notas [i]);
        }
                        //Averigua la longitud del arrays
        for (int i = 0; i < notas.length; i++) {
        }
        //Esto modificaría todos los datos uno por uno
        for (int i = 0; i < notas.length; i++) {
            notas [i] = 1; 
        }
        //Para sumarles a todas 1
        for (int i = 0; i < notas.length; i++) {
            notas [i]++; //notas [i] +=1
        }

        //Modificar un valor
        notas [2] = 1; //Cambiar el valor que está en la posición 2

        //Crear un array con datos
        int [] notas1 = {6, 4, 7, 5, 8, 3, 10}
        //Crear un array vacío
        int [] notas2 = new int[8]
    }

}