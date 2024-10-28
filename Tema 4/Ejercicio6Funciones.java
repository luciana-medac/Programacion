public class Ejercicio6Funciones {

    //OPCIÓN 2: FUNCIONES
    //En este caso, en el main si tendría el dato resultante. Ya que con el 
    //float en lugar del void, se envía un tipo de dato float
    
    public static float calcularMedia (int n1, int n2, int n3){

        return ((n1 + n2 + n3)/3.0f); //El return manda el resultado al main

        /*
         * float media = ((n1 + n2 + n3)/3.0f;
         * return media;
         */

    }

    public static float /*Aquí se especifica el tipo de dato que se le manda al main */ sumarPunto (float n){

        return (n+1);

    }

    public static void main(String[] args) {
        
        int nota1 = Integer.parseInt(System.console().readLine("Introduce nota 1: "));
        int nota2 = Integer.parseInt(System.console().readLine("Introduce nota 2: "));
        int nota3 = Integer.parseInt(System.console().readLine("Introduce nota 3: "));

        //calcularMedia (nota1, nota2, nota3); //Como aquí se llama a una función que devuelve el dato, se tiene en cuenta que esto se va a convertir en ese dato

        System.out.println( calcularMedia(nota1, nota2, nota3)); //De esta forma, podemos utilizar el resultado

        float mediaMain = calcularMedia(nota1, nota2, nota3); //Enviamos las notas al mñetodo y nos devuelve el dato
        float notaFinal = sumarPunto(mediaMain); //Con el dato devuelto, envio la nota al método y se da la nota Final

        System.out.println(notaFinal);

    }

    
}
