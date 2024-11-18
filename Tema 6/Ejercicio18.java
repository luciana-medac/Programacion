public class Ejercicio18 {

    /*
     * Desarrolla un programa que pregunta al usuario un tweet, y el usuario 
     * le copie un tweet completo (que incluye un hashtag). 
     * El programa debe localizar, entre todo el texto del tweet, 
     * cuál es exactamente el hashtag. Ejemplo:
     * Introduce un tweet: El jugador @rafanadal ha ganado su partido 
     * de semifinales en el torneo de #rolandgarros
     * El hashtag encontrado es: #rolandgarros
     */
    
    
    public static void main(String[] args) {
        
        //Le pedimos un tweet al usuario
        String tweetUsu = System.console().readLine("Introduce un tweet: ");
        
        //busca la posición en la que se encuentra el hashtag
        int posicion = tweetUsu.indexOf("#");
        String has = " ";
        //saca el hashtag, si no se usara el slipt, sacaría el hashtag hasta el final del tweet
        //con el slipt, parte el hashtag hasta el primer espacio que aparece
        has = tweetUsu.substring(posicion).split(" ")[0];
        System.out.println("El hashtag encontrado es: " + has);
    }
}
