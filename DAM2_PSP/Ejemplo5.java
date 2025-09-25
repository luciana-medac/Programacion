import java.io.IOException;
import java.util.Scanner;

public class Ejemplo5 {

    public static void main(String[] args) {

        // Menú de inicio
        Scanner sc = new Scanner(System.in);
        Process p1 = null;
        try {

            System.out.println("---------ELIGE QUÉ PROGRAMA QUIERES LANZAR--------");
            System.out.println("1. Calculadora");
            System.out.println("2. Paint");
            System.out.println("3. Google");
            String opcion = sc.nextLine();

            // De lo que elija se lanza uno u otro

            switch (opcion) {
                case "1":
                    ProcessBuilder pb1 = new ProcessBuilder("calc");
                    p1 = pb1.start();
                    break;
                case "2":
                    ProcessBuilder pb2 = new ProcessBuilder("mspaint");
                    p1 = pb2.start();
                    break;
                case "3":
                    ProcessBuilder pb3 = new ProcessBuilder(
                            "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
                    p1 = pb3.start();
                    break;
                default:
                    System.out.println("No es una opción");
            }

            // Pregunta si lo quiere cerrar
            String opcion2;
            do {
                System.out.println("¿Quieres cerra el programa?");
                opcion2 = sc.nextLine();
            } while (!opcion2.equals("si"));

            p1.destroy();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
