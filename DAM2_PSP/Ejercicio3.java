public class Ejercicio3 {

    public static void main(String[] args) throws Exception {
        

            //EJECUTAR PROGRAMAS NATIVOS DE WINDOWS NO NECESITA RUTAS

            ProcessBuilder calculadora = new ProcessBuilder("calc");
            calculadora.start();

            //Esperar un momento para asegurarnos de que la calculadora se abra completamente
            Thread.sleep(2000);

            //Ejecutar el Bloc de notas
            ProcessBuilder blocNotas = new ProcessBuilder("notepad");
            blocNotas.start();

            Thread.sleep(2000);

            //Ejecutar paint
            ProcessBuilder paint = new ProcessBuilder("mspaint");
            paint.start();

            Thread.sleep(2000);

            ProcessBuilder github = new ProcessBuilder("C:\\Users\\PC218\\AppData\\Local\\GitHubDesktop\\GitHubDesktop.exe");
            github.start();

            Thread.sleep(2000);

            

    }
    
}
