public class Ejercicio13 {

    /*
     * Desarrolla un programa que pregunte al usuario cuántas calorías ha ingerido en el desayuno. 
     * Después, debe preguntar cuántas calorías ha ingerido en el almuerzo. 
     * Después, debe preguntar cuántas calorías ha ingerido en la cena. 
     * Por último, el programa finaliza mostrando las calorías actuales totales ingeridas en el día
     */


    public static void main(String[] args) {

    //Primero preguntamos y convertimos a número entero
    int desayunoCa = Integer.parseInt(System.console().readLine("¿Cuántas calorías has ingerido en el desayuno? "));

    int almuerzoCa = Integer.parseInt(System.console().readLine("¿Cuántas calorías has ingerido en el almuerzo? "));

    int cenaCa = Integer.parseInt(System.console().readLine("¿Cuántas calorías has ingerido en la cena? "));

    //Cálculamos

    int totalCa = desayunoCa + almuerzoCa + cenaCa;

    //Mostramos los resultados

    System.out.println("Las calorías que has ingerido en el día son: " + totalCa);

    }
    
}
