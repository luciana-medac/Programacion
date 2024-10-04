public class Ejercicio14Switch {

    public static void main(String[] args) {
        
        System.out.println("Elige una de las siguientes opciones: ");
        System.out.println("1.Felicitar cumpleaños");
        System.out.println("2.Felicitar santo");
        System.out.println("3.Felicitar aniversario");

        String opcion = System.console().readLine("Introduce la opción elegida: ");

        switch (opcion) {
            case "1":

                String cumpleaños = System.console().readLine("Indica cuántos años cumples ");
                System.out.println("Feliz " + cumpleaños + " cumpleaños");
                break;
            
            case "2":

                String santo = System.console().readLine("Indica tu nombre ");
                String genero = System.console().readLine("¿Eres Hombre o Mujer? ");
                
                switch (genero) {
                    case "hombre":
                    System.out.println("Feliz San " + santo);
                        break;
                    
                    case "mujer":
                    System.out.println("Feliz Santa " + santo);
                        break;
                
                    default:
                    System.out.println("Eso no es un género");
                        break;
                }
                break;
            
            case "3":
                String aniversario = System.console().readLine("Indica de qué es tu aniversario");
                System.out.println("Feliz aniversario de ");
                break;
            
            default:
                System.out.println("Esa no es una de las opciones");
                break;
        }

    }
    
}
