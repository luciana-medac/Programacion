/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13;

/*
Ejercicio 13. Desarrolla la aplicación de gestión de libros de una biblioteca.

Los libros tienen un título, un autor, una editorial y un código, además de un 
estado (libre o reservado).

De los autores se debe conocer su nombre y su nacionalidad.

De las editoriales se debe conocer su nombre, el país y la cantidad 
de libros publicados.

Las acciones que se pueden realizar con un libro son reservarlo y devolverlo. 
Evidentemente, si un libro ya está reservado no puede reservarse, 
y si un libro no está reservado no puede devolverse.

En el main crea 5 libros y muéstralos por consola. El usuario debe poder elegir 
cuál quiere reservar, y por consola solo se mostrará si se ha podido reservar 
(porque estaba libre) o si no.
*/
public class Ejercicio13 {

    public static void main(String[] args) {
        
        //CREAMOS LA EDITORIAL
        Editorial Eterna = new Editorial ("Eterna Cadencia", "Argentina", 25);
        Editorial Shueisha = new Editorial ("Shueisha", "Japon", 40);
        Editorial Seuil = new Editorial ("Sueil", "Francia", 10);
        
        //CREAMOS LOS AUTORES
        Autor Dazai = new Autor("Dazai Osamu", "Japones");
        Autor Ernesto = new Autor("Ernesto Sabato", "Argentino");
        
        //CREAMOS LOS LIBROS
        Libro libro1 = new Libro("Indigno de ser humano", Dazai, Shueisha, 2222, true);
        Libro libro2 = new Libro("El tunel", Ernesto, Eterna, 3333, false);
        
        System.out.println("los libros son los siguientes: ");
        System.out.println("1." + libro1);
        System.out.println("2." + libro2);
        int eleccion = Integer.parseInt(System.console().readLine( "eleccion: " ));
        
        switch (eleccion) {
            case 1:
                libro1.elegirLibro();
                break;
            case 2:
                libro2.elegirLibro();
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
}
