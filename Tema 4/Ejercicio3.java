public class Ejercicio3 {

    /*
     * El programa principal pide un número al usuario y muestra un menú con opciones:
     * 1. Función que devuelve si un número pasado como parámetro es par o impar
     * 2. Método que imprime directamente la tabla de múltiplicar el número que le pasamos como parámetro
     * 3. Método que imprime un número que sea la mitad del número que le pasamos como parámetro
     * 4. Función que imprime un número aleatorio entre el 0 y el número que le pasamos como parámetro
     * 5. Método que comprueba si es primo
     * 
     * Dependiendo de la elección del usuario, se invoca un método u ootro para que realice la acción
     * pasándole como parámetro el número
     */



    //Si el número es par o impar
    public static void numParImpar(int numParImpar){

        if (numParImpar/2 == 0) {

            System.out.println("El número es par");
            
        }

        else {

            System.out.println("El número es impar");

        }

    }

    //Tabla de multiplicar
    public static void tabla(int tabla){

        for (int i=0; i<11; i++){
            
            System.out.println( tabla + " x " + i + " = " + (tabla * i));

        }

    }

    //Mitad del número
    public static void mitad(int numMitad){

        System.out.println("La mitad del número es: " + (numMitad/2));

    }

    //Número aleatorio
    public static void aleatorio(int numAlea){

        int numRandom = (int)(Math.random())*numAlea;
        System.out.println("El númeor aleatorio es: " + numRandom);

    }

    //Comprobar si es primo
    public static void primo(int numPrimo){

        int numDivisibles = 0;

        for (int i = 1; i <= numPrimo; i++) {

        

            if (numPrimo%i == 0) { //divide todos los números menores que él, si encuentra un número que de de resto 0, cuenta las veces

                numDivisibles++;
                
            }

        }

        if (numDivisibles == 2) {

            System.out.println("Es primo!!");
            
        }

        else {

            System.out.println("No es primo");

        }

    }

    public static void main(String[] args) {
        
        int numUs = Integer.parseInt(System.console().readLine("Introduce un número: "));

        System.out.println("Opciones:");
        System.out.println("1. Si es par o impar");
        System.out.println("2. Tabla de múltiplicar");
        System.out.println("3. La mitad del número");
        System.out.println("4. Número aleatorio");
        System.out.println("5. Comprobar si es primo");
        String numU= System.console().readLine("Elige opción:");

        switch (numU) {
            case "1":
                numParImpar(numUs);
                break;
            case "2":
                tabla(numUs);
                break;
            case "3":
                mitad(numUs);
                break;
            case "4":
                aleatorio(numUs);
                break;
            case "5":
                primo(numUs);
                break;
            default:
                System.out.println("No es una opción");
                break;
        }

    }
    
}
