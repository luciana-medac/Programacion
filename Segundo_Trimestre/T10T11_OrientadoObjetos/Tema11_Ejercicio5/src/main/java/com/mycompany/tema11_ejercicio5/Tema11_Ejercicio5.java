/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema11_ejercicio5;

/**
 *
 * @author molin
 */
public class Tema11_Ejercicio5 {

    public static void main(String[] args) {
        
        //CREAMOS LOS ANIMALES
        Animal animal = new Perro("firu", 4, "labrador");
        Animal anima2 = new Perro("luna", 10, "sharpei");
        
        Animal anima3 = new Gato("Cowi", 1, "negro");
        Animal anima4 = new Gato("Michi", 1, "verde");
        
        Animal anima5 = new Loro("Piki", 1, true);
        Animal anima6 = new Loro("Chisi", 4, false);
        
        
        Animal[] animales = {animal, anima2, anima3, anima4, anima5, anima6};
        
        for (int i = 0; i < animales.length; i++) {
           
            System.out.println( animales[i].getNombre() + animales[i].hacerSonido());
            
        }
        
        System.out.println(animal instanceof Perro);
        System.out.println(anima2 instanceof Perro);
        System.out.println(anima3 instanceof Gato);
        System.out.println(anima4 instanceof Gato);
        System.out.println(anima5 instanceof Loro);
        System.out.println(anima6 instanceof Loro);
        
        int contador = 0;
        
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].getEdad() >= 2) {
                
                contador++;
            }
            
            
            
        }
        
        System.out.println("hay: " + contador + " de animales adultos");
        
    }
}
