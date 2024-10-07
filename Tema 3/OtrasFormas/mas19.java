package OtrasFormas;
public class mas19 {

    public static void main(String[] args) {
        
        //Otra forma de hacer el Ejercicio 19

        String usuario = System.console().readLine("Jugador contra PC. Elige 1. piedra 2. papel 3. tijera");

        int numA = (int) (Math.random() * 3 );
        String maquina ="";

        switch (numA) {
            case 0:
                System.out.println("piedra");
                System.out.println("Yo saco " + maquina);
                break;
            case 1:
                System.out.println("papel");
                System.out.println("Yo saco " + maquina);
                break;
            case 2:
                System.out.println("tijera");
                System.out.println("Yo saco " + maquina);
        
            default:
                break;
        }

        //Comprobar

        if (usuario.equals("piedra") && maquina.equals("papel")) {

            System.out.println("Gana la maquina");
            
        }

        //Aqui añadimos todas las opciones en las que gana la maquina o el usuario

        else if (usuario.equals("piedra") && maquina) {
            
        }

        else if (usuario.equals(maquina)) {
            
            System.out.println("Empate");

        }

    }
    
}
