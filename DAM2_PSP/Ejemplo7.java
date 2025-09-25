import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo7 {
    public static void main(String[] args) {
        
        //DESARROLLA UN PROGRAMA QUE TE DEVUELVA (SOLO) LA IP DEL ORDENADOR

        try {
            
            ProcessBuilder pb1 = new ProcessBuilder("CMD", "/c", "ipconfig");
            Process p = pb1.start();

            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream())
            );

            String linea;
            String ip = "IPv4";
            while ((linea = br.readLine()) != null) {
                if (linea.contains(ip)) {
                    //System.out.println(linea.substring(47));
                    int inicio = linea.indexOf(":");
                    int ultimo = linea.length(); //linea.lastIndexOf(" ");
                    System.out.println(linea.substring(inicio, ultimo));
                }
            }

            int exitCode = p.waitFor();
            System.out.println("Proceso terminado con código: " + exitCode);

        } catch (IOException e){

            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

    }
    
}
