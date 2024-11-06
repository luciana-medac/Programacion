public class Ejercicio13 {

    /*
     *  Programa que traduce números a morse. 
     * El main pide un número al usuario y lo manda al método traducirNumMorse. 
     * El método debe devolver al main dicho número traducido a morse (puntos y guiones). 
     * El main mostrará por consola el resultado.
     * Traducción:

        1 . _ _ _ _ 
        2 . . _ _ _ 
        3 . . . _ _ 
        4 . . . . _ 
        5 . . . . . 
        6 _ . . . .
        7 _ _ . . .
        8 _ _ _ . .
        9 _ _ _ _ .
        0 _ _ _ _ _
     */
    
    public static String traducirMorse(int n){

        String traduccion = " ";

        if (n == 1) {
            traduccion =  ". _ _ _ _";
        } else if (n == 2) {
            traduccion =  ". . _ _ _";
        } else if (n == 3) {
            traduccion =  ". . . _ _";
        } else if (n == 4) {
            traduccion =  ". . . . _";
        } else if (n == 5) {
            traduccion = " . . . . .";
        } else if (n == 6) {
            traduccion = "_ . . . .";
        } else if (n == 7) {
            traduccion = "_ _ . . .";
        } else if (n == 8) {
            traduccion = "_ _ _ . .";
        } else if (n == 9) {
            traduccion = "_ _ _ _ .";
        } else if (n == 0) {
            traduccion = "_ _ _ _ _";
        }
        return traduccion;
    }

    public static void main(String[] args) {
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));
        
        System.out.println(traducirMorse(numU));
    }
    
}
