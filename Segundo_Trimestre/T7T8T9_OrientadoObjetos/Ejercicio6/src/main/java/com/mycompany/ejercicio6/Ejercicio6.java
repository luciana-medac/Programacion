
package com.mycompany.ejercicio6;


/*
Crea la clase Fracción. Los atributos serán numerador y denominador. 
Debe tener métodos para ver el numerador, ver el denominador, ver el resultado 
de dividirlos y un último método que indique si la división es exacta o no.
*/

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Fraccion fraccion1 = new Fraccion (2, 16);
        Fraccion fraccion2 = new Fraccion (85, 5);
        
        
        
        System.out.println(fraccion1);
        
        System.out.println("Fraccion 1:");
        fraccion1.mostrarDenominador();
        fraccion1.mostrarNumerador();
        
        System.out.println("-------------");
        fraccion1.divisionExacta();
        
        System.out.println("-------------------");
        
        System.out.println("Fraccion 2: ");
        
        System.out.println(fraccion2);
        
        fraccion2.mostrarDenominador();
        fraccion2.mostrarNumerador();
        
        fraccion2.divisionExacta();
        
    }
}
