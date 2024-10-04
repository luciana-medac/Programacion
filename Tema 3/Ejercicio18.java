public class Ejercicio18 {

    /*
     * Realiza un programa que muestre al azar el nombre de una carta de la baraja de póquer. 
     * Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
     * Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales 
     * y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
     * Tu programa deberá mostrar algo como “4 de picas”, “J de tréboles”, etc.
     */

    public static void main(String[] args) {
        
        
        int nombre = (int)(Math.random()*3)+1;

        if (nombre == 0) {

            int cartas = (int)(Math.random()*12)+1;
            switch (cartas) {
            case 1:
                System.out.println( "A de corazones");
                break;
            case 11:
                System.out.println("J de corazones");
                break;
            case 12:
                System.out.println("Q de corazones");
                break;
            case 13:
                System.out.println("K de corazones");
                break;
            default:
                System.out.println(cartas + " de corazones");
                break;
            }
            
        }
        else if (nombre == 1) {

            int cartas = (int)(Math.random()*12)+1;
            switch (cartas) {
            case 1:
                System.out.println( "A de picas");
                break;
            case 11:
                System.out.println("J de picas");
                break;
            case 12:
                System.out.println("Q de picas");
                break;
            case 13:
                System.out.println("K de picas");
                break;
            default:
                System.out.println(cartas + " de picas");
                break;
            }
        }

        else if (nombre == 2) {

            int cartas = (int)(Math.random()*12)+1;
            switch (cartas) {
            case 1:
                System.out.println( "A de diamantes");
                break;
            case 11:
                System.out.println("J de diamantes");
                break;
            case 12:
                System.out.println("Q de diamantes");
                break;
            case 13:
                System.out.println("K de diamantes");
                break;
            default:
                System.out.println(cartas + " de diamantes");
                break;
            }
        }

            else if (nombre == 3) {

                int cartas = (int)(Math.random()*12)+1;
            switch (cartas) {
            case 1:
                System.out.println( "A de tréboles");
                break;
            case 11:
                System.out.println("J de tréboles");
                break;
            case 12:
                System.out.println("Q de tréboles");
                break;
            case 13:
                System.out.println("K de tréboles");
                break;
            default:
                System.out.println(cartas + " de tréboles");
                break;
            }
            
            }

        }
    
}
