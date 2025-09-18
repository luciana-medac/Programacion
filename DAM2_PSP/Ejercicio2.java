import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) throws Exception {
        
        ProcessBuilder google = new ProcessBuilder("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"" , "medac.es");
        google.start();

        Thread.sleep(2000);

        ProcessBuilder edge = new ProcessBuilder("\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"", "medac.es");
        edge.start();

        Thread.sleep(2000);
    }
    
}
