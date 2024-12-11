public class Ejemplo1 {

    public static void saludar(String palabra1, String palabra2){

        System.out.println("Hola, " + palabra1 + palabra2);
        System.out.println("Que tal");

    }

    public static void main(String[] args) {
        
        System.out.println("Voy a ejecutar un método");
        String nombre = System.console().readLine("Introduce tu nombre: ");
        String apellido = System.console().readLine("Introduce tu apellido: ");

        saludar(nombre, apellido); //invocando al método pasandole un parámetro

    }
    
}
