public class Ejercicio5 {

    /*
     * Desarrolla un programa que muestre un menú al usuario con las siguientes opciones:
     * 1. Pasar de segundos a horas, minutos y segundos (4250s = 1h, 10min, 50s)
     * 2. Pasar de minutos a horas y minutos (75min = 1h y 15min)
     * 
     * En función de la opción elegida, pedirá el dato (segundos o minutos) y se lo
     * pasará por parámetro a un método para que haga los cálculos
     * y muestre los resultados
     */


    public static void opcion (int horaSegundos){

        int horas = horaSegundos/3600;
        int minutos = horaSegundos%3600;
        minutos = horaSegundos/60;
        int segundos = minutos%60;

        
        System.out.println("Total: " + horas + "h, " + minutos + " minutos " + "y " + segundos + " segundos");



    }

    public static void opcionDos (int horaMinutos) {

        int horas = horaMinutos/60;
        int horasResto = horaMinutos%60;

        System.out.println("En total son: " + horas + "h y " + horasResto + " minutos");

    }

    public static void main(String[] args) {
        
        int hora = Integer.parseInt(System.console().readLine("Introduce un número de segundos o de minutos: "));
        System.out.println("Opciones");
        System.out.println("1. Pasar de segundos a horas, minutos y segundos");
        System.out.println("2. Pasar de minutos a horas y minutos");
        String opcion = System.console().readLine();

        switch (opcion) {
            case "1":
                //llamamos al método
                opcion(hora);
                break;
            case "2":
                //llamamos al método
                opcionDos(hora);
            default:
                break;
        }

    }
    
}
