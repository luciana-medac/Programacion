public class mas33 {

    public static void main(String[] args) {
        
        int numA = (int) (Math.random()*100)+1;

        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        while (numA != numU) { //! hace que se repita el bucle mientras que el número sea distinto

            if (numA > numU) {

                System.out.println("Es mayor");
                
            }

            else if (numA < numU) {

                System.out.println("Es menor");
                
            } 
            
            else if (numA == numU) {
                
            } {
                
                System.out.println("Has acertado!!");

            }

            numU = Integer.parseInt(System.console().readLine("Introduce un número: "));
            
        }

    }
    
}
