
package com.mycompany.ejercicio6;

/**
 * CLASE PADRE
 */
//Clase abstracta para que no se puedan crear objetos Figura
public abstract class Figura {
    
    //Método abstracto para obligar a todas las subclases a que lo 
    //sobreescriban y lo adapten
    public abstract void calcularArea(); //no lleva llaves, solo punto y coma
    
    public abstract void calcularPerimetro();
        
    //PARA PONER EL NÚMERO PI --> Math.PI * Math.pow(radio, 2) primero el núm y después el exponente
    
}
