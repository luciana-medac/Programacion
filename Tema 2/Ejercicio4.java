public class Ejercicio4 {

    /* 
     * Desarrolla un programa que pregunte al usuario dos números (enteros)
     * y después muestra por consola el resultado de
     * la suma, resta, multiplicación y división de dichos números
     */

    /*
     * Cómo convertir un tipo de variable a otro:
     * String --> int           Interger.parseInt()
     * String --> float         Float.parseFloat()
     * int --> float            (float) --> antes de poner la variable que contenga el número se pone esto
     *                          ejemplo --> float division = (float)primeroNum / (segundoNum)
     *                          De esta forma, tengo la división en decimal y convierto el número entero (int) a decimal (float)
     * float --> int            (int) 
     */
    
    public static void main(String[] args) {
        
        String primero = System.console().readLine("Introduce un número ");
        int primeroNum = Integer.parseInt(primero);
        String segundo = System.console().readLine("Introduce un segundo número ");
        int segundoNum = Integer.parseInt(segundo);

        int suma = primeroNum + segundoNum;
        int resta = primeroNum - segundoNum;
        int multiplicacion = primeroNum * segundoNum;
        float division = (float)primeroNum / (float)segundoNum;

        System.out.println("si lo sumas da " + suma);
        System.out.println("si lo restas da " + resta);
        System.out.println("si lo multiplicas da " + multiplicacion);
        System.out.println("si lo divides da " + division); 


    }
}
