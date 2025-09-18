import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) throws Exception {
        
        String url;
        String navegador;

        String google = "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"";
        String edge = "\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"";

        Scanner sc = new Scanner(System.in);

        System.out.println("Qué página web quieres buscar:");
        url = sc.nextLine();

        System.out.println("Qué navegador quieres usar: ");
        System.out.println("1. Chrome");
        System.out.println("2. Microsoft Edge");
        String pregunta2 = sc.nextLine();

        if (pregunta2.equals("1")) {
            
            ProcessBuilder pb = new ProcessBuilder(google, url);
            pb.start();

        } else if (pregunta2.equals("2")) {
            
            ProcessBuilder pb2 = new ProcessBuilder(edge, url);
            pb2.start();
        } else {
            System.out.println("No es una opción");
        }
    }
}
