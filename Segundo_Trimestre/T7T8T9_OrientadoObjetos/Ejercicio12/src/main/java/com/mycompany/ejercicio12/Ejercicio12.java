
package com.mycompany.ejercicio12;

/*
Desarrolla un programa que calcule la superficie (área, en m2) de una vivienda, 
tan solo pidiendo al 
usuario las medidas de cada una de sus habitaciones (suponiendo qeu todas 
las habitaciones sean
cuadradas o rectangulares)

El programa deberá poder crear una vivienda, de la cual se debe conocer:
- Nombre del propietario
- Valor de la vivienda
- Dirección de la vivienda
- Habitaciones

De cada habitacion, se debe saber:

- Nombre de la estancia (salon, balo, cocina...)
- Lado 1
- Lado 2

El main del programa preguntará al usuario el nombre, el valor de la vivienda, 
la dirección de la vivienda y cuántas habitaciones tiene.
Después, irá preguntando uno a uno los datos de cada habitacion
Al terminar las preguntas, creará los objetos correpondientes y llamará a 
un método de la clase Vivienda encargado de calcular el área total 
(este método puede llamar a otros de la clase Habitación si es necesario)

Para finalizar, el programa mostrará por consola los metros totales de la vivienda
*/
public class Ejercicio12 {

    public static void main(String[] args) {
        
        //PREGUNTAMOS AL USUARIO
        
        //Planteamiento: hacer un du while con las preguntas y guardarlas en el array de habitaciones
        
        //Nombre, lado1 y lado2
        
        System.out.println("Crea tu habitacion: ");
        
        int numHabitaciones = Integer.parseInt(System.console().readLine("¿Cuantas habitaciones quieres para tu vivienda?"));
        
        
        
        Habitacion[] habitaciones = new Habitacion[numHabitaciones];
        
        
        for(int i=0; i < numHabitaciones; i++){
            
            String nombre = System.console().readLine(" ¿Qué habitación es? (salon, cocina, ect)");
            int lado1 = Integer.parseInt(System.console().readLine("¿Cuantos metros tendrá el primer lado?"));
            int lado2 = Integer.parseInt(System.console().readLine("¿Cuantos metros tendrá el segundo lado?"));
            
            habitaciones[i] = new Habitacion(nombre, lado1, lado2);
        }
        
        Vivienda casa1 = new Vivienda ("casa", 150000 , "Av Escoces", habitaciones);
        
        casa1.mostrarAreaVivienda();
        
        System.out.println(casa1);
        
        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println(habitaciones[i]);
        }
        
        
    }
}
