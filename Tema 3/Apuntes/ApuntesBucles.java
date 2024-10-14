package Apuntes;
public class ApuntesBucles {

    public static void main(String[] args) {

        //Estructura que repite lo que tiene dentro

    //Tipo 1. bucle FOR

    for(int i = 0; i<10; i++) {

        //Esto se va a repetir
        System.out.println("Hola");
        
        //En el parentesis se dice cuántas veces se va a repetir
        //1. Creamos la variable y especificamos donde:
        //2. Decimos hasta donde cuenta
        //3. Decimos i++ para que cuente de 1 en 1
        //se empieza a contar en 0, cuenta hasta 9 y cuenta de uno en uno (tambien se puede i=i+1) (se puede de dos en dos i=i+2)

        System.out.println("Voy por la repetición " + i);

    }

    //Para saber cuál de los dos usar pregunto "Cuántas veces se tiene que repetir el bucle"
    //Si lo sé --> FOR
    //Si no lo sé --> WHILE

    //Tipo 2. bucle WHILE

    int num = 5;
    while (num < 10) { //Se pone solo UNA condición

        System.out.println("Hola");
        
    }

    //do no tiene condicion
        
        int nume = 5;
        //lo que haría sería imprimir una vez el hola y después comprobar la condición
        do{

            System.out.println("hola");
            
        } while (nume < 3);

        //tecera versión --> bucle infinito

        while (true) {
            System.out.println("hola");
        }

        
    }


}
