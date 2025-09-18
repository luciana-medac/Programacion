public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");

        //Esta clase se utiliza para cuando quiera interactuar cuando el proceso esté en ejecución
        Process p = pb.start();

        //Si quiero solamente lanzarla:
        //pb.start();

    }
    
}