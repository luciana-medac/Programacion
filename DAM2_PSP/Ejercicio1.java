public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        Process p = pb.start();

    }
    
}