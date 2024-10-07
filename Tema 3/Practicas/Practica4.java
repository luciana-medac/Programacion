package Practicas;
public class Practica4 {

    /*
     * Desarrolla un programa que introduciendo el número de día de la semana
     * te diga qué día es (ejemplo: 3 es miércoles, 7 es domingo)
     * -------------------------------------------------------------------------------- 
     * En lugar de decir el número, va a decir lunes, martes, miércoles, jueves
     * viernes, sábado y domingo, y tiene que responder con el número de la semana
     * al que corresponde (lunes es el primer día de la semana)
     */

    public static void main(String[] args) {
        
        String dia = System.console().readLine("¿Qué día de la semana es hoy? ");

        if (dia.equals("Lunes") || dia.equals("lunes")) {

            System.out.println("Hoy es el primer día de la semana");
            
        }

        else if (dia.equals("Martes") || dia.equals("martes")) {

            System.out.println("Hoy es el segundo día de la semana");
            
        }

        else if (dia.equals("Miércoles") || dia.equals("miercoles") || dia.equals("miércoles") || dia.equals("Miercoles")) {

            System.out.println("Hoy es el tercer día de la semana");
            
        }

        else if (dia.equals("Jueves") || dia.equals("jueves")) {

            System.out.println("Hoy es el cuarto día de la semana");
            
        }

        else if (dia.equals("Viernes") || dia.equals("viernes")) {

            System.out.println("Hoy es el quinto día de la semana");
            
        }

        else if (dia.equals("Sábado") || dia.equals("sabado") || dia.equals("sábado") || dia.equals("Sabado")) {

            System.out.println("Hoy es el sexto día de la semana");
            
        }

        else if (dia.equals("Domingo") || dia.equals("domingo")) {

            System.out.println("Hoy es el séptimo día de la semana");
            
        }

        else {

            System.out.println("Eso no es un día de la semana");

        }

    }
    
}
