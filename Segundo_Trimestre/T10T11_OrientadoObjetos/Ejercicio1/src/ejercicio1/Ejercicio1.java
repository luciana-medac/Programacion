/*
* Proyecto desarrollado por Luciana Molina
*/
package ejercicio1;

/*
Clase padre:
    - Vehiculo

Clases hijo:
    - Coche
    - Motos
    - Camiones
    - Autobuses

Se crea la clase padre, después las clases hijo.
La clase padre se crea normal
En las clases hijo especificamos algo especial
*/

/*
PALABRAS RESERVADAS:
    - extends 
*/

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //NO hay que crear ningún objeto vehiculo
        Coche coche1 = new Coche("Opel", "Corsa", "1918FPN", 100000, 50, 20, 5);
        
        //Puedo llamar al método gracias a que lo hereda de la clase padre, entonces, vamos a poder usar
        //ese método en todas las clases hijo
        coche1.precioDescuento();
        
    }

}
