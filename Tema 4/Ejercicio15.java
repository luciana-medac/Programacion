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

    public static void color() {
        //Se genera un número random del 1 al 4
        int numColor = (int) (Math.random() * 3) + 1;
        //Según el número que salga, muestra un color u otro
        switch (numColor) {
            case 1:
                System.out.println("Ha salido: verde");
                break;
            case 2:
                System.out.println("Ha salido: rojo");
                break;
            case 3:
                System.out.println("Ha salido: negro");
        }
    }

                                //A este método le llega el dato de int opcion
    public static void numAleatorio(int numA) {
        //Primero declaramos las variables
        int numRule = 0; //Para el número random de la ruleta
        int numSec = 0; //Para el número random de la sección

        switch (numA) {
            case 2: //Si se elige la opción dos
                //Se genera un número aleatorio del 0 al 37
                numRule = (int) (Math.random() * 37);
                //Se muestra el número
                System.out.println("Ha salido de la ruleta: " + numRule);
                break;
            case 3: //Si se elige la opción 3
                //Se genera un número aleatorio del 1 al 3
                numSec = (int) (Math.random() * 2) + 1;
                //Se muestra el número que ha salido
                System.out.println("Ha salido la sección: " + numSec);
            default:
                break;
        }

    }

                                //A esta función le llega el dato de String parImpar ("par" o "impar")
        //Sale de la función un dato tipo int
    public static int parImpar(String opcion) {
        //Se declara la variable num para modificarla en función de si es par o impar
        int num = 0;
        //Se comprueba el string opcion
        switch (opcion) {
            case "par": //Si elige par hace:
                //Primero saca un número random del 0 al 36
                do {
                    num = (int) (Math.random() * 37);
                } while (num % 2 != 0); //Mientras el número que salga, si se divide entre 2 y no da de resto 0, sigue el bucle
                break;
            case "impar": //Si elige impar hace:
                //Primero saca un número random del 0 al 36
                do {
                    num = (int) (Math.random() * 37);
                } while (num % 2 == 0); //Mientras el número que salga, si se divide entre 2 y da de resto 0, sigue el bucle
                break;
        }
        return num; //Devuelve el resultado para después mostrarlo el main
    }

    public static void dados(int d1) {
        int numD = 0;
        int numD2 = 0;
        switch (d1) {
            case 5:
                numD = (int) (Math.random() * 5) + 1;
                System.out.println("Ha salido: " + numD);
                break;
            case 6:
                numD = (int) (Math.random() * 5) + 1;
                numD2 = (int) (Math.random() * 5) + 1;
                System.out.println("Dado uno: " + numD + " Dado dos: " + numD2);
            default:
                break;
        }

    }

    
    public static void carta(int p1) {

        int numCaRam = p1;

                switch (numCaRam) {
                    case 1:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de diamantes");
                        } else if (numCaRam == 11) {
                            System.out.println("J de diamantes");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de diamantes");
                        } else if (numCaRam == 13) {
                            System.out.println("K de diamantes");
                        } else {
                            System.out.println(numCaRam + " de diamantes");
                        }
                        break;
                    case 2:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de corazones");
                        } else if (numCaRam == 11) {
                            System.out.println("J de corazones");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de corazones");
                        } else if (numCaRam == 13) {
                            System.out.println("K de corazones");
                        } else {
                            System.out.println(numCaRam + " de corazones");
                        }
                        break;
                    case 3:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de picas");
                        } else if (numCaRam == 11) {
                            System.out.println("J de picas");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de picas");
                        } else if (numCaRam == 13) {
                            System.out.println("K de picas");
                        } else {
                            System.out.println(numCaRam + " de picas");
                        }
                        break;
                    case 4:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de treboles");
                        } else if (numCaRam == 11) {
                            System.out.println("J de treboles");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de treboles");
                        } else if (numCaRam == 13) {
                            System.out.println("K de treboles");
                        } else {
                            System.out.println(numCaRam + " de treboles");
                        }
                        break;
                    default:
                        break;
                }

    }


    public static void main(String[] args) {
        System.out.println("*****PROGRAMA CROUPIER*****");
        System.out.println("1. Sacar un color alatorio (rojo, negro o verde)");
        System.out.println("2. Sacar un número de la ruleta (0 - 36)");
        System.out.println("3. Sacar sección aleatoria de la ruleta (1,2 o 3)");
        System.out.println("4. Sacar aleatoriamente par o impar");
        System.out.println("5. Lanzar un dado");
        System.out.println("6. Lanzar dos dados");
        System.out.println("7. Sacar una carta de la baraja de póker (palo concreto)");
        System.out.println("8. Sacar una carta de la baraja de póker (cualquier palo)");
        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                // Aquí se invoca al método color para generar uno de los tres de forma aleatoria
                color();
                break;
            case 2:
                // se Invoca al médotodo para sacar un número aleatorio de la ruleta (0-36)
                numAleatorio(opcion);
                break;
            case 3:
                // Se invoca al método para sacar una sección aleatoria (1, 2 o 3)
                numAleatorio(opcion);
                break;
            case 4:
                // Primero se pregunta si quiere un número par o impar
                String parImpar = System.console().readLine("Introduce par o impar: ");
                // Se manda el dato y la función da un número random del 0 al 36 y muestra el par o el impar
                // La función devuelve el dato y lo guardamos
                int num = parImpar(parImpar);
                //Se muestra por consola el número que haya salido
                System.out.println(parImpar(parImpar));
                break;
            case 5:
                // Lanzar un dado
                dados(opcion);
                break;
            case 6:
                // Lanzar dos dados
                dados(opcion);
                break;
            case 7:
                //Se muestran las opciones del 1 al 4 para elegir el palo
                System.out.println("----ELIGE UNO----");
                System.out.println("1. Diamantes");
                System.out.println("2. Corazones");
                System.out.println("3. Picas");
                System.out.println("4. Tréboles");
                int opcionPalo = Integer.parseInt(System.console().readLine("Respuesta: "));
                //el método comprueba y muestra la carta aleatoria con el palo que se ha elegio
                carta(opcionPalo);
                break;
            case 8:
                //Se genera el número random del 1 al 4
                int numR = (int)(Math.random()*3)+1;
                //El método comprueba el número y se muestra la carta aleatoria con el palo aleatorio
                carta(numR);
            default:
                break;
        }
    }

}
