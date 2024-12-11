public class Ejercicio9 {

    /*
     * Desarrolla un programa que pida al usuario una temperatra, preguntándole
     * primero si la quiere introducir en grados C, F o K
     * Si se introduce en F o K, se deben de convertir primero a C
     * Una vez los tenemos en C se pasan los grados a otro método que devuelve al main
     * la palabra "frio" "templado" o "calor" (haz los rangos que quieras)
     * 
     * Lo que está mal de este ejercicio es que en lugar de que convierta los grados del usuario
     * a Kelvin o Celsius, es que el usuario introduce los grados O EN K O FA y entonces se le dice
     * si hace frio, calor o templado
     */
    
    public static int convertidorKelvin ( int gradosUno) {
        gradosUno = gradosUno + 273;
        return gradosUno;
    }

    public static int convertidorFaren (int gradosDos) {
        gradosDos = ((gradosDos * 5)/9) + 32;
        return gradosDos;
    }

    public static String comprobarTemperatura ( int gradosTres) {

        String temperatura = " ";

        if (gradosTres > 30) {
            temperatura = "Hace calor";   
        }

        else if (gradosTres < 20) {
            temperatura = "Hace frío";
        }

        else if (gradosTres >= 20 && gradosTres < 30) {
            temperatura = "Está templado"; 
        }
        return temperatura;
    }


    public static void main(String[] args) {
        
        int grados = Integer.parseInt(System.console().readLine("Introduce los grados: "));
        System.out.println("A qué quieres convertir los grados?");
        System.out.println("1. Celsius");
        System.out.println("2. Kelvin");
        System.out.println("3. Farenheit");
        String opcion = System.console().readLine();

        switch (opcion) {
            case "1":
                String resultado = comprobarTemperatura(grados);
                System.out.println("Los grados son: " + grados + " ºC y " + resultado);
                break;
            case "2":
                String resKelvin = comprobarTemperatura(grados);
                int resulKelvin = convertidorKelvin(grados);
                System.out.println("Los grados son: " + resulKelvin + " ºK y " + resKelvin);
                break;
            case "3":
                String resFa = comprobarTemperatura(grados);
                int resulFa = convertidorFaren(grados);
                System.out.println("Los grados son: " + resulFa + " ºF y " + resFa);
            default:
                break;
        }


    }

}
