public class Pruebas2 {
    
    public static void main(String[] args) {
        
        System.out.println("Hola");
        String nombreusuario = System.console().readLine("¿Cómo te llamas? ");
        System.out.println("Bienvenido, " + nombreusuario);
        String ciudad = System.console().readLine("¿De dónde eres? ");
        System.out.println("Adiós, " + nombreusuario + " de " + ciudad);

    }

}
