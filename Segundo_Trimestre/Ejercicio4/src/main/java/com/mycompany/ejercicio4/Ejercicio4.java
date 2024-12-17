/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/* Personas.
    Crea una clase llamada personas que tenga como atributos el nombre, la edad, el género, y la nacionalidad, y como métodos tenga los habituales
    (constructor, setters, getters y toString).

    También se necesita un método que se llame presentacionIdioma() y que haga muestra una presentación de la persona en su idioma
    (se admite en español, inglés, francés e italiano)

    En el main, haz varias personas de ejemplo e imprimir su presentacionIdioma para ver que todo funciona correctamente*/

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Persona persona1 = new Persona ("Gonzalo" , 23, "Hombre", "español");
        //Persona persona2 = new Persona ("Mathew" , 20, "Hombre", "ingles");
        //Persona persona3 = new Persona ("Marinette" , 19, "Mujer", "frances");
        //Persona persona4 = new Persona ("Jovanni" , 27, "Hombre", "italiano");
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad:");
        int edad = sc.nectInt();
        sc.nextLine();
        System.out.println("Género: ");
        String genero = sc.nextLine();
        System.out.println("Nacionalidad: ");
        String nacionalidad = sc.nextLine();
        
        Persona persona1 = new Persona (nombre, edad, genero, nacionalidad);
        
    }
    
    
}
