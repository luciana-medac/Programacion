public class Ejercicio3 {

    /*
     * Desarrolla un programa que pregunte al usuario el número de dorsal de un equipo
     * y muestre el número jugador que tiene ese dorsal.
     */

    public static void main(String[] args) {

        //primero pregunto y convierto la variable
        int dorsal = Integer.parseInt(System.console().readLine("Introduce el número de dorsal: "));

        //uso el condicional para especificar el numero de dorsal 
        //(cuando quiero indicar si el numero es igual, se pone doble)
        if (dorsal == 8) {

            System.out.println("Acuña");

        }

        else if (dorsal == 11) {

            System.out.println("Di Maria");
            
        }

        else if (dorsal == 10) {

            System.out.println("Messi");
            
        }

        else if (dorsal == 9) {

            System.out.println("Julian");
            
        }

        else if (dorsal == 7) {

            System.out.println("De Paul");
            
        }

        //falta el resto del equipo
        else {

            System.out.println("No está registrado el jugador");

        }


        //if (solo puede haber una), else if, else (solo puede haber una)
        //Operadores de comparación: > < <= >= ==
        //Si hay dos condiciones usamos &&
    }
    
}
