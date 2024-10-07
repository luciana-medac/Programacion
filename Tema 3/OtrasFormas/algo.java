package OtrasFormas;
public class Algo {

    /*
     * Ejercicio 18 de otra forma
     */

    public static void main(String[] args) {

        //Obtener palo aleatorio
        
        int numPalo = (int)(Math.random()*4);
        String 

        switch (numPalo) {
            case 0:
                System.out.println("Corazones");
                break;
            case 1:
                System.out.println("Diamantes");
                break;
            case 2:
                System.out.println("Tréboles");
                break;
            case 3:
                System.out.println("Picas");
                break;
    
        }

        //Obtener carta aleatoria

        int numCarta = (int)(Math.random()*13+1);

        switch (numCarta) {
            case 1:
                System.out.println("A");
                break;
            case 11:
                System.out.println("J");
                break;
            case 12:
                System.out.println("Q");
                break;
            case 13:
                System.out.println("K");
                break;
        }



    }
    
}
