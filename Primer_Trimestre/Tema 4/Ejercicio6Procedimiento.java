public class Ejercicio6Procedimiento {

    /*
     * Calcular la Media de Tres Notas
     * 
     * Crea un método calcularMedia 
     */

    //OPCIÓN 1: PROCEDIMIENTO (void)
    //Si tiene void, recibe los datos pero no se los envía al main



    public static void calcularMedia (int n1, int n2, int n3){

        System.out.println((n1+n2+n3)/3);

    }

    public static void main(String[] args) {
        
        int nota1 = Integer.parseInt(System.console().readLine("Introduce nota 1: "));
        int nota2 = Integer.parseInt(System.console().readLine("Introduce nota 2: "));
        int nota3 = Integer.parseInt(System.console().readLine("Introduce nota 3: "));

        calcularMedia (nota1, nota2, nota3);


    }
    
}
