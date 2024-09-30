public class Apuntes {

    //ESTRUCTURAS DE CONTROL --> Mecanismo para alterar el orden de ejecución

    //if (condicionales o estructuras de seleccion)
    //else (sino)
    
    /*
     * Crea un programa que te pregunte un número y te diga 
     * si es mayor que 100 o menor que 100
     */

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Introduce un numero: "));

        //Cuando tenga dos opciones

        //la condición solo se pone en el if y en el else if
        //if (numero >= 100) { 
        
        //System.out.println("El numero introducido es mayor que 100 ");

        //} 

        //else { 

        //System.out.println("El número introducido es menor que 100 ");

        //}

        //Cuando tenga más de dos opciones

        if (numero >= 100) {

            System.out.println("El número es mayor que 100");

        }

        //&& se pone doble en programacion, para que se cumplan las dos cosas, actúa como y
        else if (numero > 100 && numero <200) {
            
            System.out.println("El número está entre 100 y 200");

        }

        else {

            System.out.println("El número es mayor que 200");

        }

        //if (solo puede haber una), else if, else (solo puede haber una)
        
        //Operadores de comparación: > < <= >= ==
        
        //Si hay dos condiciones usamos &&

        

    }

}