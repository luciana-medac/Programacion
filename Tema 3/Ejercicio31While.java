public class Ejercicio31While {

    public static void main(String[] args) {
        
        int meta = Integer.parseInt(System.console().readLine("Cuánto quieres ahorrar "));
        int ingresos = 0;

        while (ingresos < meta) {

            ingresos += Integer.parseInt(System.console().readLine("Cuánto quieres ingresar "));
            System.out.println("Te faltan " + (meta - ingresos ) + " euros");
    
        }

        System.out.println("Has alcanzado tu meta!!");

    }
    
}
