public class Apuntes3 {

    public static void main(String[] args) {
        
        char letra = 'h'; //un caracter

        String palabra = "hola"; //cadena de caracteres

        //char[] arrayChar = {'h','o','l','a'}; --> Java internamente considera a esto un String
        
        //TODO SALE EN EL TEMA 6, EN UNA TABLA EN EL PUNTO 12.2   

        System.out.println(palabra.length()); //la longitud del array, es decir el número de letras que tiene la palabra

        System.out.println(palabra.indexOf('o')); //Muestra la posición en la que está el caracter 
                                                    //(en la primera aparición, si hay dos o, muestra la primera)
        System.out.println(palabra.lastIndexOf('a')); //Muestra la posición en la que está el caracter
                                                    //(en la última aparición)
        palabra.toUpperCase(); //Pasa la frase entera a mayuscula
        palabra.toLowerCase(); //Pasa la frase entera a minuscula

    }
}
