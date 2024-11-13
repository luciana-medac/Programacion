public class Ejercicio7 {

    /*
     * Realiza un prohrama que ppida la temperatura media que ha hecho en cada mes de
     * un determinado año (estos datos los va introduciendo el usuario y se guardan en un array)
     * El programa debe ir indicando el mes, por ejemplo:
     * "Introduce la media de enero: "
     * 
     * Una vez preguntamos todos los meses, el programa debe mostrar un diagrama de barras
     * horizontales con esos datos. Las barras del diagrama se puede dibujar a base de asteriscos 
     * o cualquier otro carácter. El diagrama mostradoo debería ser algo así:
     * 
     * [ENE] ********
     * [FEB] ***********
     * [MAR] **************
     */

    public static void main(String[] args) {
        
        int [] temperatura = new int[12];

        String [] meses = {"enero", "febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octube","noviembre","diciembre"};

        for (int i = 0; i < meses.length; i++) {
            
            temperatura[i] = Integer.parseInt(System.console().readLine("Introduce la media de " + meses[i] + ": "));
        }

        for (int i = 0; i < meses.length; i++) {
            System.out.print( "[" + meses[i] + "]");
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
