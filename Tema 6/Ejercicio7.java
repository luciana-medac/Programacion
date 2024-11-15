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
        
        //Creo los dos arrays
        int [] temperatura = new int[12];

        String [] meses = {"enero", "febrero","marzo","abril","mayo","junio","julio","agosto",
        "septiembre","octube","noviembre","diciembre"};

        //Pregunto las temperaturas de cada mes
        for (int i = 0; i < meses.length; i++) {
            
            temperatura[i] = Integer.parseInt(System.console().readLine("Introduce la media de " + meses[i] + ": "));
        }

        //Muestro los asteriscos por cada mes
        for (int i = 0; i < temperatura.length; i++) {
            System.out.print( "[" + meses[i] + "]"); //bucle para cada mes
            for (int j = 0; j < temperatura[i]; j++) {  //bucle para asteriscos de cada mes
                System.out.print("*");
            } //haz esto en solo un mes para prácticarlo

            System.out.println();
        }
    }
}
