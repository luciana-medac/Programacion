public class Ejercicio13Modificado {

     /*
     * Desarrolla un programa que pregunte al usuario cuántas calorías ha ingerido en el desayuno. 
     * Después, debe preguntar cuántas calorías ha ingerido en el almuerzo. 
     * Después, debe preguntar cuántas calorías ha ingerido en la cena. 
     * Por último, el programa finaliza mostrando las calorías actuales totales ingeridas en el día
     * DESPUÉS DE CADA PREGUNTA QUE MUESTRE CUÁNTAS CALORÍAS LLEVA EN TOTAL
     */


     public static void main(String[] args) {

        int caloriasTotal = 0;

        //Primero preguntamos y convertimos a número entero
        int desayunoCa = Integer.parseInt(System.console().readLine("¿Cuántas calorías has ingerido en el desayuno? "));

        caloriasTotal = caloriasTotal + desayunoCa;
        System.out.println("llevas " + caloriasTotal);
    
        int almuerzoCa = Integer.parseInt(System.console().readLine("¿Cuántas calorías has ingerido en el almuerzo? "));

        caloriasTotal = caloriasTotal + almuerzoCa;
        System.out.println("llevas " + caloriasTotal);
    
        int cenaCa = Integer.parseInt(System.console().readLine("¿Cuántas calorías has ingerido en la cena? "));

        caloriasTotal = almuerzoCa + cenaCa;
        System.out.println("llevas " + caloriasTotal);
    
        //Cálculamos
    
        caloriasTotal = desayunoCa + almuerzoCa + cenaCa;
    
        //Mostramos los resultados
    
        System.out.println("Las calorías que has ingerido en el día son: " + caloriasTotal);
    
        }
    
}
