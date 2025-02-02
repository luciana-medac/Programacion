/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author molin
 */
public class Rectangulo extends Figura{
    
    @Override
    public void calcularArea(){
        
        int a = Integer.parseInt(System.console().readLine("Introduce la altura: "));
        int b = Integer.parseInt(System.console().readLine("Introduce el ancho lado: "));
        
        System.out.println("el area es: " + (a*b));
    }
    
}
