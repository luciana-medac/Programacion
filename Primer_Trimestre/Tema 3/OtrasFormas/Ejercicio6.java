package OtrasFormas;
public class Ejercicio6 {

    /*
     * Desarrolla una calculadora de horoscopo. 
     * Introduce tu día de nacimiento
     * Introduce tu mes de nacimiento
     * Tiene que decir qué horoscopo es
     */

    public static void main(String[] args) {

        //Primero preguntamos el mes de nacimiento
        String mes = System.console().readLine("Introduce tu mes de nacimiento ");

        //Variables:
        // - Primitivas (fáciles) --> int, char, float
        // - Complejas --> String
        
        //Según el mes se irá a un condicional u otro

        if (mes.equals("enero") || mes.equals("1")) {
            
            //Una vez haya comprobado que es el mes, pregunta el día
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));

            //Según el día, es un signo u otro
            if (dia >= 1 && dia <=19) {

                System.out.println("Eres Capricornio");
                
            }

            else if (dia >= 20 && dia <= 31) {

                System.out.println("Eres Acuario");
                
            }

            else {
                
                System.out.println("No existes");

            }
        }

        else if (mes.equals("febrero") || mes.equals("Febrero") || mes.equals("2")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=18) {

                System.out.println("Eres Acuario");
                
            }

            else if (dia >= 19 && dia <= 28) {

                System.out.println("Eres Piscis ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("marzo") || mes.equals("Marzo") || mes.equals("3")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=20) {

                System.out.println("Eres Piscis");
                
            }

            else if (dia >= 21 && dia <= 31) {

                System.out.println("Eres Aries ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("abril") || mes.equals("Abril") || mes.equals("4")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=19) {

                System.out.println("Eres Aries");
                
            }

            else if (dia >= 20 && dia <= 30) {

                System.out.println("Eres Tauro");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("mayo") || mes.equals("Mayo") || mes.equals("5")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=20) {

                System.out.println("Eres Tauro");
                
            }

            else if (dia >= 21 && dia <= 31) {

                System.out.println("Eres Géminis");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("junio") || mes.equals("Junio") || mes.equals("6")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=20) {

                System.out.println("Eres Géminis");
                
            }

            else if (dia >= 21 && dia <= 30) {

                System.out.println("Eres Cáncer ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("julio") || mes.equals("Julio") || mes.equals("7")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=22) {

                System.out.println("Eres Cáncer");
                
            }

            else if (dia >= 23 && dia <= 31) {

                System.out.println("Eres Leo");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("agosto") || mes.equals("Agosto") || mes.equals("8")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=22) {

                System.out.println("Eres Leo");
                
            }

            else if (dia >= 23 && dia <= 31) {

                System.out.println("Eres Virgo ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("septiembre") || mes.equals("Septiembre") || mes.equals("9")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=22) {

                System.out.println("Eres Virgo");
                
            }

            else if (dia >= 23 && dia <= 30) {

                System.out.println("Eres Libra ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("octubre") || mes.equals("Octubre") || mes.equals("10")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=22) {

                System.out.println("Eres Libra");
                
            }

            else if (dia >= 23 && dia <= 31) {

                System.out.println("Eres Escorpio ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("noviembre") || mes.equals("Noviembre") || mes.equals("11")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=22) {

                System.out.println("Eres Escorpio");
                
            }

            else if (dia >= 23 && dia <= 30) {

                System.out.println("Eres Sagitario");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else if (mes.equals("diciembre") || mes.equals("Diciembre") || mes.equals("12")) {

            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            
            if (dia >= 1 && dia <=21) {

                System.out.println("Eres Sagitario");
                
            }

            else if (dia >= 22 && dia <= 31) {

                System.out.println("Eres Capricornio ");
                
            }

            else {
                
                System.out.println("No existes");

            }
            
        }

        else {

            System.out.println("No existe ese mes");

        }

    }
    
}
