public class Ejercicio11 {

    public static void main(String[] args) {
        
    /*
    * Desarrolla un conversor de bits a bytes
    */
        
        //Primero convierto y pregunto
        int conversor = Integer.parseInt(System.console().readLine("¿Cuántos bits quieres convertir? "));

        //Hago el cálculo
        int bytes = conversor / 8;

        //Muestro el resultado
        System.out.println("En total son: " + bytes + " bytes");

    }
    
}
