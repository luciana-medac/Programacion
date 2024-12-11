public class Ejercicio12 {

    /*
     * Crea un método llamado calcularArea que permita calcular el area de cuadrados y rectángulos. 
     * Si al método se le pasa un solo parámetro, dará por hecho que se trata de un cuadrado 
     * y calculará su area (lado*lado). 
     * Si se le pasan dos parámetros, dará por hecho que se trata de un rectáculo 
     * y calculará su área con la formula (lado1*lado2).
     */

    public static int calcularArea(int n1, int n2){
        int area = n1 * n2;
        return area;

    }
    public static int calcularArea(int n1){
        int area = n1 * n1;
        return area;
    }


    public static void main(String[] args) {
        
        System.out.println("Quieres calcular el area de un cuadrado o rectangulo? ");
        String pregunta = System.console().readLine();

        switch (pregunta) {
            case "cuadrado":  
                int lado11 = Integer.parseInt(System.console().readLine("Introduce el lado: "));
                System.out.println("El área es: " + calcularArea(lado11));
            break;
            case "rectangulo":
                int lado1 = Integer.parseInt(System.console().readLine("Introduce un lado: "));
                int lado2 = Integer.parseInt(System.console().readLine("Introduce el otro lado: "));
                System.out.println("El area es: " + calcularArea(lado1,lado2));
            break;
        }
    }
    
}
