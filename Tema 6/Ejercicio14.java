public class Ejercicio14 {

    /*
     * Crea un array con el nombre de 5 compañeros de clase. Ahora, el
     * programa preguntará el nombre al usuario y comprobará si está o no
     * entre los 5 guardados en el array (tu programa debe funcionar tanto si
     * los nombres son mayúsculas como si no)
     */

    public static void main(String[] args) {
        
        String [] nombres = {"andy", "pablo", "dani", "carlos","alex"};

        String nUsuario = System.console().readLine("Introduce un nombre: ");

        nUsuario = nUsuario.toLowerCase();

        for (int i = 0; i < nombres.length; i++) {
            if (nUsuario.equals(nombres[i])) {
                System.out.println("está");
                break;
            }
            if (nUsuario.equals(nUsuario)) {
                
            }
        }
    }
    
}
