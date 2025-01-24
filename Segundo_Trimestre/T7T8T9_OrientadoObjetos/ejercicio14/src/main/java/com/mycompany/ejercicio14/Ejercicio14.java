package com.mycompany.ejercicio14;

/**
 Desarrolla una aplicación para la venta de entradas de un pequeño estadio deportivo.

Del estadio se debe saber la ciudad en la que se encuentra y la empresa que lo gestiona. 
* El estadio cuenta con 3 zonas: grada, tribuna y palco. La grada tiene 100 asientos, la tribuna 50 y el palco 20.

Crea una clase ‘zona’ genérica, diseñada de forma que al crear un objeto se especifique al 
* constructor si es ‘grada’, ‘tribuna’ o ‘palco’ y automáticamente se asigne el número de plazas 
* (el número de plazas no se le pasa al constructor, se asigna automáticamente al especificar el 
* tipo de zona que es). También se deben saber el número de plazas disponibles, que inicialmente
* serán las mismas que las totales, pero que irán disminuyendo a medida que se vayan reservando.

Implementa los métodos venderEntradas y mostrarEntradasDisponibles en la clase zona. En la clase 
* Estadio también debe haber un método mostrarEntradasDisponibles, que en este caso mostrará el 
* total de entradas disponibles en el estadio.

Usa el main para hacer pruebas, creando un estadio con sus zonas, haciendo varias reservas, y después 
* mostrando las plazas disponibles tanto en las zonas como en total en el estadio. Recuerda que en el
* main no deben hacerse operaciones, éstas deben estar en los métodos correspondientes, el main tan solo ejecuta métodos.
 */
public class Ejercicio14 {

public static void main(String[] args) {
    
        Zona grada = new Zona ("grada");
        Zona tribuna = new Zona ("tribuna");
        Zona palco = new Zona ("palco");
        // Crear el estadio
        Estadio estadio = new Estadio("Madrid", "Deportes S.A.", grada, tribuna, palco);

        // Mostrar información del estadio
        System.out.println(estadio);

        // Mostrar las entradas disponibles
        estadio.mostrarEntradasDisponibles();
        System.out.println("Total de entradas disponibles en el estadio: " + estadio.mostrarEntradasDisponiblesTotales());

        // Vender entradas
        estadio.venderEntradasGrada(30);    // Vender 30 entradas en la grada
        estadio.venderEntradasTribuna(20); // Vender 20 entradas en la tribuna
        estadio.venderEntradasPalco(5);    // Vender 5 entradas en el palco

        // Mostrar el estado después de las ventas
        System.out.println("Estadio después de las ventas:");
        estadio.mostrarEntradasDisponibles();
        System.out.println("Total de entradas disponibles en el estadio: " + estadio.mostrarEntradasDisponiblesTotales());
}
}
