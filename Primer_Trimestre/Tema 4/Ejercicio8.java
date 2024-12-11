public class Ejercicio8 {

    /*
     * Desarrolla un programa que pida un número al usuario y se lo pase a un
     * método. El método comprobará si el número es positivos, negativo o cero, y
     * enviará una respuesta en formato String al main. El main mestra el resultado
     */


                                    //Parámetro que recibe (int numU)
    public static String comprobacion (int numU) {

        String comprobar = " ";

        if (numU < 0) {

            comprobar = "Es negativo";
            
        }

        else if (numU > 0) {

            comprobar = "Es positivo";
            
        }

        else {

            comprobar = "Es cero";

        }

        return comprobar;


    }

    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(System.console().readLine("Introduce un número: "));

        String resultado = comprobacion(num); //de esta forma guardamos en una variable el método

        System.out.println(resultado);

    }
    
}
