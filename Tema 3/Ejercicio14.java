public class Ejercicio14 {
    
    /*
     * Crea un menú que te de a elegir entre si quieres que te felicite tu santo, por tu cumpleaños o por tu aniversario.
     * - Si eliges tu santo, te preguntará tu nombre y te responderá algo como, por ejemplo: "feliz San Lucas".
     * - Si eliges cumpleaños, te preguntará cuántos cumples y entonces te felicitará incluyendo tu edad. Por ejemplo: "feliz 30 cumpleaños".
     * - Si eliges aniversario, te preguntará de qué es el aniversario para poder decirte algo como "feliz aniversario de boda".
     */

    
    public static void main(String[] args) {
        
        String pregunta = System.console().readLine("Elige tu felicitación: cumpleaños, santo o aniversario");

       if (pregunta.equals("cumpleaños")) {

            int cumpleaños = Integer.parseInt(System.console().readLine("¿Cuántos cumples?"));
            System.out.println("Feliz " + cumpleaños + " cumpleaños");

       }

       else if (pregunta.equals("santo")) {

            String santo = System.console().readLine("¿Cuál es tu nombre?");
            System.out.println("Feliz San " + santo);
       }

       else if (pregunta.equals("aniversario")) {

            String aniversario = System.console().readLine("¿De qué es tu aniversario?");
            System.out.println("Feliz aniversario " + aniversario);
        
       }

       else {

            System.out.println("Eso no es una opción");

       }


    }
}
