public class otraVersion33 {

    public static void main(String[] args) {
        
        int numAleatorio = (int)(Math.random()*101);
        int numUsuario;

        do{

            numUsuario = Integer.parseInt(System.console().readLine("Introduce un número: "));

            if (numAleatorio > numUsuario) {

                System.out.println("Es mayor");
                
            }
            else if (numAleatorio < numUsuario) {

                System.out.println("Es menor");
                
            }

        } while (numAleatorio != numUsuario);

        System.out.println("Acertaste!!!");

    }
    
}
