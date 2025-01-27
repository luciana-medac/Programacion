
package com.mycompany.ejercicio16;

/**
 * Crea una clase CuentaBancaria que tenga los datos del 
 * titular (nombre, dni, direccion)
 * un número de cuenta y un saldo
 * 
 * Debe tener los métodos ingresar, sacar dinero y mostrar saldo
 * 
 * Además, se dene ir controlando el dinero que hay en total en el 
 * banco(la suma del finero de todos los clientes) 
 * para lo que se creara un atributo estático en unc clase aparte
 * 
 * En el main, haz 3 cuentas del banco y hazle varias operaciones 
 * de ingresar y sacar dinero, 
 * para comprobar después cuanto dinero hay en total en el banco
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        
        Titular titular1 = new Titular("Jovanni", "78284512F", "C/Falsa1");
        Titular titular2 = new Titular("Amanda", "78451232D", "C/Falsa2");
        Titular titular3 = new Titular("Norman", "78621348S", "C/Falsa3");
        
        CuentaBancaria cuenta1 = new CuentaBancaria(titular1, 8888, 15000);
        CuentaBancaria cuenta2 = new CuentaBancaria(titular2, 9999, 7200);
        CuentaBancaria cuenta3 = new CuentaBancaria(titular3, 7777, 15);
        
        
        
        cuenta1.ingresarDinero(15);
        cuenta1.sacarDinero(40);
        cuenta3.ingresarDinero(70);
        cuenta2.sacarDinero(150);
        
        System.out.println("Dinero total del banco" + BancoTotal.dineroTotal);
        
        
        
        
    }
}
