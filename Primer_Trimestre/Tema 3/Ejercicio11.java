public class Ejercicio11 {
    
    /*
     * Desarrolla un programa que pregunte al usuario el número de dorsal de un equipo
     * y muestre el número jugador que tiene ese dorsal.
     * 
     * NUEVA ESTRUCTURA
     */

     public static void main(String[] args) {

        //primero pregunto y convierto la variable
        int dorsal = Integer.parseInt(System.console().readLine("Introduce el número de dorsal: "));

        //Estructura condicional 'switch' 
        //En esta estructura ya no se hace una comparación, se pone directamente el valor 
        //Esta estructura no deja comparar, por lo que tendría que usar la estructura de if, else if, else
        //brake --> hace que el programa pare de hacer la comprobación de todos los casos
        //default --> lo que hará si no se cumple ninguno de los casos

        switch (dorsal) { //Mira qué valor hay en esta variable
            case 1: //Si hay un 1...
                System.out.println("Courtois");  //Haz esto
                break;                             //Deja de comprobar

            case 2:
                System.out.println("Antonio");
                break;
            
            case 3:
                System.out.println("Juanito");
                break;

            //Podemos poner todos los "case" que necesitemos
        
            default:
                break;
        }

    }

}
