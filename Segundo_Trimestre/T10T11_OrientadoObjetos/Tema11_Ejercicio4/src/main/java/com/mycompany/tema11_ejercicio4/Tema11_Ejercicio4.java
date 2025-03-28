/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema11_ejercicio4;

/**
 *
 * @author molin
 */
public class Tema11_Ejercicio4 {

    public static void main(String[] args) {
        
        
        //CREACIÓN DE LOS CONTACTOS
        Contacto c1 = new Contacto("Carlos", "888888888", "carlos@gmail.com");
        Contacto c2 = new Contacto("Marina", "999999999", "marina@gmail.com");
        Contacto c3 = new Contacto("Samuel", "777777777", "samuel@gmail.com");
        
        Contacto[] contactos1 = {c1, c2, c3};
        
        Grupo grupo2 = new Grupo("ContactosMaria", 3);
        
        //MUESTRA LOS CONTACTOS (DEBEN DE APARECER 3)
        System.out.println("CONTACTOS ----------------------------");
        grupo2.mostrarContactos();
        
        Contacto c4 = new Contacto("Martina", "666666666", "martina@gmail.com");
        grupo2.agregarContacto(c4);
       
        System.out.println("BUSCAMOS EL CONTACTO -----------------");
        System.out.println(grupo2.buscarContacto("Carlos"));
        
        System.out.println("ELIMINAMOS A SAMUEL ------------------");
        grupo2.eliminarContacto("Samuel");
        
                
    }
}
