public class Ejercicio4 {

    /*Desarrolla un programa que introduciendo el número de día de la semana
     * te diga qué día es (ejemplo: 3 es miércoles, 7 es domingo)
     */

    public static void main(String[] args) {
        
        int dia = Integer.parseInt(System.console().readLine("Qué día de la semana es "));

        if (dia == 1) {

            System.out.println("Es Lunes");
            
        }

        else if (dia == 2) {

            System.out.println("Es Martes");
            
        }

        else if (dia == 3) {

            System.out.println("Es Miercoles");
            
        }

        else if (dia == 4) {

            System.out.println("Es Jueves");
            
        }

        else if (dia == 5) {

            System.out.println("Es Viernes");
            
        }

        else if (dia == 6) {

            System.out.println("Es Sábado");
            
        }

        else if (dia == 7) {

            System.out.println("Es Domingo");
            
        }

       else {

        System.out.println("El número no corresponde con ningún día de la semana");

       }

    }
    
}
