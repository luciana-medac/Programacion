
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
        int lado1 = Integer.getInteger(System.console)
        
        Habitacion[] habitaciones1 = {
            
            new Habitacion ("salon", 50, 45 ),
            new Habitacion ("cocina", 60, 55),
            new Habitacion ("cuartoUno", 30, 40),
            new Habitacion ("cuartoDos", 30, 45)
            
        }
        
    }
}
