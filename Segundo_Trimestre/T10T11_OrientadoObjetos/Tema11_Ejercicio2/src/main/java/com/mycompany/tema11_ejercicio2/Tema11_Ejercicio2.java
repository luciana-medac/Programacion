/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema11_ejercicio2;

/**
 *
 * @author PC218
 */
public class Tema11_Ejercicio2 {

    public static void main(String[] args) {
        
        Producto p1 = new Producto("Galletas", 1.2, 3);
        Producto p2 = new Producto("Bollos", 2.3, 5);
        Producto p3 = new Producto("Bizcocho", 4.3, 4);
        
        Producto[] productos1 = {p1,p2,p3} ;
        
        Seccion s1 = new Seccion("Bolleria", productos1);
        
        s1.mostrarNombre();
        System.out.println("LO SIGUIENTE DA ERROR -----------");
        s1.productosBajoStock();
        System.out.println("VALOR TOTAL -----------");
        
        double n = s1.calcularValorTotalStock();
        
        System.out.println(n);
    }
}
