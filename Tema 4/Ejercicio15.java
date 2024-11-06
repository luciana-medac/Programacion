public class Ejercicio15 {

    /*
     * Programa Croupier (adaptación de ejercicios 16 y 18 del tema 3, ahora con
     * métodos). El main muestra menú de opciones:
     * 
     * Sacar un color aleatorio de la ruleta (rojo, negro o verde).
     * Sacar un número aleatorio de la ruleta (de 0 a 36 incluidos).
     * Sacar una sección aleatoria de la ruleta (1, 2 o 3).
     * Sacar aleatoriamente par o impar.
     * Lanzar 1 dado.
     * Lanzar 2 dados.
     * Sacar carta de la baraja póker, de un palo concreto.
     * Sacar carta de la baraja póker, de cualquier palo.
     * El usuario elige una opción y el main llama al método correspondiente.
     * Puedes hacer que el método imprima el valor obtenido o que se lo devuelva al
     * main para que este lo imprima,
     * en este ejercicio es indiferente.
     * 
     * Importante: aunque el usuario tenga 8 opciones, intenta que no haya 8
     * métodos, optimizándolos de
     * forma que un método pueda servir para varias opciones.
     */

    public static void color(){
        int numColor = (int)(Math.random()*3)+1;

        switch (numColor) {
            case 1:
                System.out.println("verde");
                break;
            case 2:
                System.out.println("rojo");
                break;
            case 3:
                System.out.println("negro");
        }
    }
    public static int numAleatorio(String opcion){

        int num = 0;

        switch (opcion) {
            case "par":
            int numPar = (int)(Math.random()*37);
                if (numPar%2 == 0) {
                    num = numPar;
                }
                break;
            case "impar":
            int numImpar = (int)(Math.random()*37);
                if (numImpar%2 != 0) {
                    num = numImpar;
                }
        }
        return num;

    }
    public static void parImpar (){

    }
    public static void dados(){

    }
    public static void carta(){

    }
    
    public static void main(String[] args) {
        System.out.println("*****PROGRAMA CROUPIER*****");
        System.out.println("1. Sacar un color alatorio (rojo, negro o verde)");
        System.out.println("2. Sacar un número de la ruleta (0 - 36)");
        System.out.println("3. Sacar sección aleatoria de la ruleta (1,2 o 3)");
        System.out.println("4. Sacar aleatoriamente par o impar");
        System.out.println("5. Lanzar un dato");
        System.out.println("6. Lanzar dos dados");
        System.out.println("7. Sacar una carta de la baraja de póker (palo concreto)");
        System.out.println("8. Sacar una carta de la baraja de póker (cualquier palo)");
        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                //Aquí se llama al método
                color();
                break;
            case 2:
                //Primero se pregunta si quiere un número par o impar
                //El método da un número random del 0 al 36 y muestra el par o el impar
                //Se invoca al método
                String parImpar = System.console().readLine("Introduce par o impar: ");
                int num = parImpar();
                System.out.println(num);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                System.out.println("No es una opción. Adiós.");
                break;
        }
    }

}
