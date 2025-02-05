
package com.mycompany.ejercicio6;

public class Cuadrado extends Figura{
    
    @Override
    public void calcularArea(){
        
        int a = Integer.parseInt(System.console().readLine("Introduce el lado: "));
        
        System.out.println("el area es: " + (a*a));
    }
    
    @Override
    public void calcularPerimetro(){
        
        int a = Integer.parseInt(System.console().readLine("Introduce el lado: "));
        System.out.println("el perimetro es: " + (a*4));
        
    }
    
}
