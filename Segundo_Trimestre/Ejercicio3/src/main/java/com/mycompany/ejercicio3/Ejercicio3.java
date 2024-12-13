
package com.mycompany.ejercicio3;

/*
Fecha. En un proyecto se necesita trabajar con fechas, que contienen días, mes y año
Desarrolla una clase Fecha de forma que al construir objetos fecha especifiquemos
desde el main un dia, mes y año.

Además necesitamos las siguientes opciones:

Imprimir solo el día
Imprimir solo el mes
Imprimir solo el año
Imprimir la fecha completa en formato dd/mm/aaaa
Imprimir la estación a la que pertenece la fecha (verano, invierno primavera,
otoño)
*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha(12,05,2023);
        
        System.out.println("Opciones a mostrar: ");
        System.out.println("1. Imprimir el día");
        System.out.println("2. Imprimir el mes");
        System.out.println("3. Imprimir el año");
        System.out.println("4. Imprimir la fecha completa");
        System.out.println("5. Imprimir la estación de la fecha");
        
        int opcion = Integer.parseInt(System.console().readLine( "tu opción: "));
        
        switch (opcion) {
            case 1:
                //imprime el dia
                break;
            case 2:
                //imprime el mes
                break;
            case 3:
                //imprime el año
                break;
            case 4:
                //imprime la fecha completa
                break;
            case 5:
                //imprime la estacion
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
}
