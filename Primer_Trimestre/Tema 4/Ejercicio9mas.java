public class Ejercicio9mas {


    public static float convertirF (float Fa) {

        float celsiu = (Fa - 32) * 5 / 9;
        return celsiu;
    }

    public static float convertirK (float K) {

        float celsiu = (K - 273.15f);
        return celsiu;
    }

    public static String comprobacion (float temperaturaCels) {

        String temperatura = " ";

        if (temperaturaCels > 30) {
            temperatura = "Hace calor";   
        }

        else if (temperaturaCels < 20) {
            temperatura = "Hace frío";
        }

        else if (temperaturaCels >= 20 && temperaturaCels < 30) {
            temperatura = "Está templado"; 
        }
        return temperatura;
    }

    public static void main(String[] args) {
        
        
        System.out.println("En qué unidades me vas a decir la temperatura:");
        System.out.println("1. Celsius");
        System.out.println("2. Kelvin");
        System.out.println("3. Fahreinheit");
        String tipo = System.console().readLine();

        float temp = Integer.parseInt(System.console().readLine("Introduce la temperatura: "));

        float tempC = 0;

        switch (tipo) {
            case "1":
                tempC = temp;
                String resultado = comprobacion(tempC);
                System.out.println("Hacen: " + temp + " ºC y " + resultado);
                break;
            case "2":
                tempC = convertirK(temp);
                String resultadoKel = comprobacion(tempC);
                System.out.println("Hacen: " + tempC + " ºK y " + resultadoKel);
                break;
            case "3":
                tempC = convertirF(temp);
                String resultadoFa = comprobacion(tempC);
                System.out.println("Hacen: " + tempC + " ºF y " + resultadoFa);
                break;
            
            default:
                break;
        }

    }
    
}
