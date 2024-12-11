public class Ejercicio15 {

    /*
     * Desarrolla un programa con el que puedas jugar al piedra, papel o tijera
     */

    public static void main(String[] args) {
        
        //Math.random genera números aleatorios entre 0 y 1
        //Yo quiero:
        // - Sea entre 0 y 2
        // - No quiero decimales

        int numAleatorio = (int) (Math.random()*3); 
        //Para que Java haga primero la multiplicación, se ponen paréntesis

        //System.out.println( Math.random( )*3 ); //lo multiplico por 3 para que cuando genero un número, se multiplique (voy a tener 0 y pico, 1 y pico y 2 y pico)

        //Aqui decimos qué números son piedra, papel o tijera
        switch (numAleatorio) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
            //No es necesario default, ya que al ejecutarse varios casos, no pregunta al usuario, asi que no se puede equivocar
        }


    }
    
}
