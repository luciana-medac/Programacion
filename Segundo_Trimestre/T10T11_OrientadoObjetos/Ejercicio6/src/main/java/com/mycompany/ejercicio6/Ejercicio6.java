package com.mycompany.ejercicio6;

/*
Crea una clase Figura genérica que cuente con un método calcularArea(). Luego, crea 3 subclases de 3 figuras 
geométricas concretas, las que tú quieras (triángulo, cuadrado, rectángulo, círculo... las que quieras) 
que deben sobreescribir el método para calcular su área correspondiente. Para este ejercicio, es necesario 
investigar primero qué es la sobreescritura y qué significa la palabra @Override (punto 6 del tema 10), 
porque el método calcularArea() lo vamos a poner en la superclase pero se debe modificar en las subclases.
 */
public class Ejercicio6 {

    public static void main(String[] args) {

//        Figura figura1 = new Figura();
//        figura1.calcularArea();
        Figura rectangulo1 = new Rectangulo();
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();

        Figura cuadrado = new Cuadrado();
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        
        

    }
}
