public class Ejercicio7 {

    /*
     * Desarrolla un programa que pida la edad al usuario y la mande a un método
     * El método comprobará si es mayor de edad o no, y delverá
     * al main una frase que será "es mayor de edad" o "es menor de edad"
     */


    public static String frase(int edadU){

        String frase = " ";

        if (edadU >=18) {
            frase = "Es mayor de edad";
        }

        else if (edadU < 18) {
            frase = "Es menor de edad";
        }

        return frase; //devuelve al main esta variable (la variable es STRING, asi que se pone el STRING arriba)


    }

    public static void main(String[] args) {
        
        int edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));

        System.out.println(frase(edad));

    }
    
}
