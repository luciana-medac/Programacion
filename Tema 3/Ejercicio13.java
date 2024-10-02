public class Ejercicio13 {
    
    /*
     * Calculador de nómina. Programa que te pide nº de horas semanales y calcula tu nómina semanal, 
     * teniendo en cuenta que las primeras 40h se cobran a 10€  
     * y las siguientes horas extra a 12€
     */

    public static void main(String[] args) {
        
        int horas = Integer.parseInt(System.console().readLine("¿Cuántas horas has trabajado esta semana? "));

        if (horas <= 40) {

            horas = horas * 10;
            System.out.println("Te corresponden: " + horas + " euros esta semana");
            
        }

        else if (horas > 40) {

            int horaEx = (horas - 40)*12 + (10*40);
            System.out.println("Te corresponden: " + horaEx + " euros esta semana");
            
        }

        else {

            System.out.println("No funciona");

        }

    }
}
