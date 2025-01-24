
package com.mycompany.ejercicio9;

/*
Implementa la clase "TarjetaRegalo" que tenga como atributos el nombre
del cliente, un número de 5 cifras aleatorio y 20€ de saldo. Implementa
los métodos habituales además del método gastar() y recargar()
*/

public class Ejercicio9 {

    public static void main(String[] args) {
        
        TarjetaRegalo tarjeta1 = new TarjetaRegalo ("Alex");
        
        System.out.println(tarjeta1);
        
        System.out.println(tarjeta1.getSaldo());
        System.out.println(tarjeta1.getNumA());
        
        tarjeta1.Gastar(10);
        tarjeta1.Recargar(15);
        
        System.out.println(tarjeta1.getSaldo());
    }
}
