import java.nio.channels.Pipe.SourceChannel;

public class Ejercicio10 {

    /*
     * Realiza un pequeño cuestionario tipo test de 5 preguntas, que autocorrija
     * y te muestre la nota al terminar
     */

    
    public static void main(String[] args) {
        
        String cosaUno = System.console().readLine("¿Quieres empezar el test? ");

        int nota = 0;

        if (cosaUno.equals("si")) {

            String preguntaUno = System.console().readLine("¿Qué juego fue GOTY en el 2020? A:TLOU B:Zelda C:Start Valley ");

            if (preguntaUno.equals("A")) {

                System.out.println("Correcto!");
                nota = nota + 1;
                
            }

            else if (preguntaUno.equals("B") || preguntaUno.equals("C")) {
                
                System.out.println("Incorrecto");

            }

            else {

                System.out.println("No es una respuesta del test");

            }


            String preguntaDos = System.console().readLine("¿En qué año ganó Maradona el mundial? A:1974 B:1986 C:1988 ");

            if (preguntaDos.equals("B")) {
                
                System.out.println("Correcto!");
                nota = nota + 1;

            }

            else if (preguntaDos.equals("A") || preguntaDos.equals("C")) {
                
                System.out.println("Incorrecto");

            }

            else {

                System.out.println("No es una respuesta del test");

            }


            String preguntaTre = System.console().readLine("¿Qué comida es típica de España? A:milanesas B:Spaguetti C: Tortilla " );

            if (preguntaTre.equals("C")) {

                System.out.println("Correcto!");
                nota = nota + 1;
                
            }

            else if (preguntaTre.equals("A") || preguntaTre.equals("B")) {

                System.out.println("Incorrecto");
                
            }

            else {

                System.out.println("No es una respuesta del test");

            }

            String preguntaCua = System.console().readLine("¿Cuál es una marca de ordenador? A:HP B:SL C:BSS ");

            if (preguntaCua.equals("A")) {

                System.out.println("Correcto!");
                nota = nota + 1;
                
            }

            else if (preguntaCua.equals("B") || preguntaCua.equals("C")) {
                
                System.out.println("Incorrecto");

            }

            else {

                System.out.println("No es una respuesta del test");

            }

            String preguntaCin = System.console().readLine("¿De qué color era la pintura que comía Van Gogh? A:Verde B:Azul C:Amarillo ");

            if (preguntaCin.equals("C")) {

                System.out.println("Correcto!");
                nota = nota + 1;
                
            }

            else if (preguntaCin.equals("A") || preguntaCin.equals("B")) {
                
                System.out.println("Incorrecto");

            }

            else {

                System.out.println("No es una respuesta del test");

            }
            
            System.out.println("Tu nota final es: " + nota );

        }

        else if (cosaUno.equals("no")) {
            
            System.out.println("Tienes un 0 :D");

        }

        else {

            System.out.println("Respuesta no válida");

        }
        

    }
    
}
