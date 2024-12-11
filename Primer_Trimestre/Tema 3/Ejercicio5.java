public class Ejercicio5 {
    
    /*
     * Escribe un programa que te pregunte la nota que has sacado en una asignatura y te diga si corresponde a un insuficiente,
     * bien, notable o sobresaliente
     */

     public static void main(String[] args) {
        
        Float nota = Float.parseFloat(System.console().readLine("Introduce la nota que hayas sacado en programación "));

        if (nota < 4.9) {

            System.out.println("Tienes un suspenso, trabaja más");
            
        }

        else if (nota >= 5 && nota < 5.9) {

            System.out.println("Tienes un suficiente, puedes hacer más");
            
        }

        else if (nota >= 6 && nota < 6.9) {

            System.out.println("Tienes un bien, vas por buen camino");
            
        }

        else if (nota >= 7 && nota < 8.9) {

            System.out.println("Tienes un notable, muy bien!!");
            
        }

        else if (nota >= 9 && nota <= 10) { 

            System.out.println("Enhorabuena");

            //if anidado
            if (nota == 10) {

                System.out.println("Matricula de Honor");
                
            }

            else {
                
                System.out.println("Tienes un sobresaliente, enhorabuena!!! :D");
            
            }

        }

        else {

            System.out.println("Inventarse notas está feo");

        }

     }
}
