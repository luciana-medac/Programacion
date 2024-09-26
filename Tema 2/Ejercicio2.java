public class Ejercicio2 {
    
    /*Desarrolla un programa que pregunte al usuario su año de nacmiento y su nombre, 
    y después muestre por consola el nombre y cuántos años tiene esa persona
    Nombre: Juan
    Año de Nacimiento: 2002
    Juan tiene 22 años */

    public static void main(String[] args) {
        
        String Nombre = System.console().readLine("Nombre");
        String AñoDeNacimiento = System.console().readLine("Año de Nacimiento");
        int AñoDeNacimientoNum = Integer.parseInt(AñoDeNacimiento);
        int FechaActualNum = 2024 - AñoDeNacimientoNum;

        
        System.out.println(Nombre + " tiene " + FechaActualNum + " años ");


    }

}
