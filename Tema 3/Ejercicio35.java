

public class Ejercicio35 {

    /*
     * Crea un programa que simule una cuenta bancaria. 
     * El usuario puede introducir si desea ingresar o retirar finero y qué cantidad
     * El programa sigue ejecutándose hasta que el saldo sea inferior a cero auros
     */

    public static void main(String[] args) {
        
        String pregunta;

        int cantidad = 0;
        int retiro = 0;
        int saldo = 0;


        do{

            pregunta = System.console().readLine("¿Desea ingregar o retirar? ");

            if (pregunta.equals("ingresar")) {

                cantidad = Integer.parseInt(System.console().readLine("Introduce la cantidad a ingresar: "));
                System.out.println((cantidad + saldo));
                
            }

            else if (pregunta.equals("retirar")) {

                retiro = Integer.parseInt(System.console().readLine("Introduce la cantidad a retirar:  "));
                System.out.println(cantidad - retiro);
                
            }

            else{
                System.out.println("No responde");
            }

            System.out.println("Saldo en números rojos");

        }while (saldo < cantidad);

    }
    
}
