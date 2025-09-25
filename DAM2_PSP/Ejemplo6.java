import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo6 {

    public static void main(String[] args) {
        //DESARROLLA UN PROGRAMA DE JAVA QUE HAGA UN PING A MEDAC.ES Y MUESTRE LOS RESULTADOS

        try {
            ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "ping medac.es"); //--> /c es que vas a añadirle un comando
            Process p = pb.start();

            //Capturar y mostrar la salida del comando
            BufferedReader br = new BufferedReader(
            new InputStreamReader(p.getInputStream()));

            String linea;
            while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            }

            //Esto es para asegurarse que no haya habido ningún error
            int exitCode = p.waitFor();
            System.out.println("Proceso terminado con código: " + exitCode);

            }catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
