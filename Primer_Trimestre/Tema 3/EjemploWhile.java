public class EjemploWhile {

    public static void main(String[] args) {
        
        int num = 5;

        //do no tiene condicion
        //lo que haría sería imprimir una vez el hola y después comprobar la condición
        do{

            System.out.println("hola");
            
        } while (num < 3);

        //tecera versión --> bucle infinito

        while (true) {
            System.out.println("hola");
        }




    }
    
}
