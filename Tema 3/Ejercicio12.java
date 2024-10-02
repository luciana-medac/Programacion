public class Ejercicio12 {

    public static void main(String[] args) {
        
        Float precio = Float.parseFloat(System.console().readLine("¿Cuánto cuesta el producto? "));
        String tipo = System.console().readLine("¿Es de primera necesidad o no? ");

        switch (tipo) {
            case "si":
                
                System.out.println("El precio sería de " + precio*1.10f);
                break;

            case "no":

                System.out.println("El precio es de " + precio*1.20f);
                break;

            default: 
                System.out.println("No funciona esa respuesta");
                break;
        }

    }
    
}
