import java.util.Scanner;

public class EjemploScanner {

    //Sirve para pedir un dato al usuario

    public static void main(String[] args) {
        
        int edad = Integer.parseInt(System.console().readLine());

        Scanner sc = new Scanner(System.in); //creamos el escaner
        int num = sc.nextInt();              // nextInt o nextLine para convertir 
        String palabra = sc.nextLine()
        sc.close();                         //se cierra el scanner
    }
    
}
