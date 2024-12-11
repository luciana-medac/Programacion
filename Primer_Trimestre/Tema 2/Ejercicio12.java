public class Ejercicio12 {
    
/*
 * Haz un programa que pregunte al usuario cuánto dinero tiene en el banco,. 
 * Después, el programa debe preguntar cuánto quiere gastar, y hacer las cuentas necesarias. 
 * Después, el programa debe preguntar cuánto desea ingresar, y hacer las cuentas necesarias. 
 * Por último, muestra el dinero final en la cuenta
 */

 public static void main(String[] args) {
    
    Float banco = Float.parseFloat(System.console().readLine("¿Cuánto dinero tienes en el banco? "));
    Float gasto = Float.parseFloat(System.console().readLine("¿Cuánto dineor quieres gastar? "));
    Float ingreso = Float.parseFloat(System.console().readLine("¿Cuánto desea ingresar? " ));

    //float total = banco - gasto; lo que había hecho al principio
    //float todo = total + ingreso;

    //Actualizamos el saldo restando el gasto
    banco = banco - gasto; 
    //esta variable se va actualizando, no se necesita poner el tipo porque ya lo hemos puesto antes
    //hacer esto lo que hace es modificar la variable

    //Actualizo el saldo sumando el ingreso
    banco = banco + ingreso;


    System.out.println("Tiene en la cuenta: " + banco );

 }

}
