public class Ejercicio33 {

    /*
     * Crea un programa que genere un número aleatorio entre 1 y 100
     * y pida al usuario que lo adivine. El programa debe seguir preguntando
     * una y otra vez hasta que el usuario realmente lo acierte (sin número máximo de intentos)
     * Tras cada pregunta, irá diciendo si el número buscado es mayor o menor que el introducido, 
     * para dar pistas al usuario
     */

    public static void main(String[] args) {
        
        
        int num = (int)(Math.random()*100) + 1;
        int numUsuario = Integer.parseInt(System.console().readLine("Adivina el número: "));
        
        while (num < numUsuario) {
            
            numUsuario = Integer.parseInt(System.console().readLine("Adivina el número: "));
            System.out.println("El número es menor que el introducido");
            
        }

        while (num > numUsuario) {
            numUsuario = Integer.parseInt(System.console().readLine("Adivina el número: "));
            System.out.println("El número es mayor al introducido");
            
        }

        if (num == numUsuario) {

            System.out.println("Lo has adivinado");
            
        }

    }
    
}
