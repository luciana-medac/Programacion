public class Ejercicio19 {

    /*
     *  Juego ‘jugador contra PC’ de piedra, papel o tijera. Primero el usuario introduce su elección, 
     * después el programa genera aleatoriamente la suya y la muestra, 
     * y por último el programa indica quién ha ganado.
     */
    
    public static void main(String[] args) {
        
        System.out.println("Jugador vs PC");
        System.out.println("Elige");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");

        String eleccion = System.console().readLine("Introduce tu elección: ");

        if (eleccion.equals("1")) {

            int pc = (int) (Math.random()*3);

            switch (pc) {
                case 0:
                    System.out.println("Piedra");
                    System.out.println("empate");
                    break;
                
                case 1:
                    System.out.println("Papel");
                    System.out.println("gano yo jiji");
                    break;
                
                case 2:
                    System.out.println("Tijera");
                    System.out.println("ganas tú, felicidades");
                    break;
                default:
                    break;
            }
            
        }

        else if (eleccion.equals("2")) {

            int pc = (int) (Math.random()*3);

            switch (pc) {
                case 0:
                    System.out.println("Piedra");
                    System.out.println("ganas tú, felicidades");
                    break;
                
                case 1:
                    System.out.println("Papel");
                    System.out.println("empate");
                    break;
                
                case 2:
                    System.out.println("Tijera");
                    System.out.println("gano yo jiji");
                    break;
                default:
                    break;
            }
            
        }

        else if (eleccion.equals("3")) {

            int pc = (int) (Math.random()*3);
            switch (pc) {
                case 0:
                    System.out.println("Piedra");
                    System.out.println("gano yo jiji");
                    break;
                
                case 1:
                    System.out.println("Papel");
                    System.out.println("ganas tú, felicidades");
                    break;
                
                case 2:
                    System.out.println("Tijera");
                    System.out.println("empate");
                    break;
                default:
                    break;
            }
            
        }


    }

}
