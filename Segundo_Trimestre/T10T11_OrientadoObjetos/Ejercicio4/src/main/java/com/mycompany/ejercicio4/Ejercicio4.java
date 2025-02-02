
package com.mycompany.ejercicio4;

/*
Supongamos que debemos hacer un software para un almacén de bebidas.
En el almacén hay zumos, refrescos y bebidas alcohólicas. Todas tienen nombre, marca y precio (precio por litro).
Añade también a cada una algún dato extra que consideres importante de cada bebida en concreto.
Todas las clases deben tener los siguientes métodos:
- Un método que reciba la edad del usuario e indique si puede tomar dicha bebida o no.
- Un método que reciba el volumen de la botella e indique el precio total.
Planifica bien dónde va cada atributo y dónde va cada método, y crea objetos de ejemplo 
en el main para probar tanto la creación de los objetos como el funcionamiento de los métodos.
*/
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Zumo zumo1 = new Zumo("Zumo Naranja", "BiFrutas", 2, tipoZumo.NARANJA);
        
        BebidaAlcoholica BA1 = new BebidaAlcoholica("Vodka", "RusiaSl", 1000, tipoBAlcoholica.VODKA);
        
        Refresco refre1 = new Refresco("Coca", "Cocacola", 3, tipoRefresco.COCACOLA);
        
        
        System.out.println("ELIJA SU BEBIDA: ");
        System.out.println("1. Zumo");
        System.out.println("2. Refresco");
        System.out.println("3. Algo más fuerte");
        int opcion = Integer.parseInt(System.console().readLine("eleccion: "));
        
        int edad = 0;
        int precio = 0;
        
        switch (opcion) {
            case 1:
                System.out.println(zumo1);
                break;
            case 2:
                System.out.println(refre1);
                break;
            case 3:
                
                precio = Integer.parseInt(System.console().readLine("Introduce los ml de la bebida: "));
                edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));
                BA1.edadUsuario(edad);
                BA1.precioBebida(precio);
                break;
            default:
                throw new AssertionError();
        }
    }
}
