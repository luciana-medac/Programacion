package com.mycompany.ejercicio1;
/*
    CLASES - OBJETOS
    
    Clase coche --> definiendo un nuevo tipo de dato
        - Matricula (String)
        - Marca
        - Modelo (String)
        - Color (String)
        - NºKm (int)

    Clases = plantilla (es un fichero de java nuevo, en el que vamos a configurar una plantilla para un nuevo objeto)
    Objetos = elementos creados a partir de la clase (coche1, coche2...)
    
*/

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Creamos el objeto
        Coche coche1 = new Coche("4444KNM","Renault","Clio","rojo",120000);
        Coche coche2 = new Coche("3322MNG","Renault","Clio","verde",20000);
        
        //Ejecutamos sus métodos
        coche1.imprimirCoche();
        
        //cambiamos los datos
        //coche1.kilometros = -200000;
        coche1.setKilometros(305000);
        coche1.setMarca("Audi");
        
        //Se imprime el coche con los datos modificados
        coche1.imprimirCoche(); //primero se pone lo que se quiere imprimir (el objeto), punto y se llama al método
        
        coche1.comprobarKm(); 
        
        
    }
   
}

        
