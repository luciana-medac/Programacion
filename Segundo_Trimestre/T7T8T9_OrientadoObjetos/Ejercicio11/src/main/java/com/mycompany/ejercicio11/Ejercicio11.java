
package com.mycompany.ejercicio11;

/*
En un zoologico exiten 5 zonas (Sabana, Oceano, Selva, Granja, Artico) De cada zona se deben saber
- Persona responsable de cuidados de los animales de la zona
- Metros cadrados de la zona
- Presupuesto mensaul adignado a la zona
- Si la zona está actualmente abierta al publico o no
- Lista de animales que hay en la zona

Por otro lado de las personas cuidadoras de zona se debe saber:
- Nombre
- DNI
- Numero de telefono

De los animales, se debe saber

- Nombre
- Tipo(mamifero, reptil, ave...)
- Edad

En el main crea 2 zonas, cada uno con su persona responsable y al menos 3 animale

Clase zona:

Una persona es responsable de una zona y en una zona puede haber muchos aniamels

*/
public class Ejercicio11 {

    public static void main(String[] args) {
        
        
        //Creamos las personas
        Persona persona1 = new Persona("Martina", "78281185H", 953264250);
        Persona persona2 = new Persona("Juan", "78280210D", 66523124);
        
        //Creamos el array de los animales
        Animal[] animales1 = {
        new Animal ("Cocodrilo", "Reptil", 20),
        new Animal ("Serpiente", "Reptil", 5),
        new Animal ("Lagarto", "Reptil" , 6)
        };
        
        Animal[] animales2 = {
            new Animal ("Oso polar", "mamifero", 15),
            new Animal ("Pinguino", "ave", 13),
            new Animal ("Foca", "mamifero", 24)
        };
        
        Zona Sabana = new Zona (persona1, 1500, 150000, true, animales1);
        Zona Artico = new Zona (persona2, 1800, 200000, false, animales2);
        
        System.out.println(Sabana);
        Sabana.mostrarNombres();
        System.out.println(Artico);
        Artico.mostrarNombres();
        
    }
}
