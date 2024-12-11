public class Ejercicio17 {

    /*
     * Desarrolla un programa que simule la tirada de 3 dados y te muestre el resultado de cada uno de los 3, y la suma de los 3
     */
    
    public static void main(String[] args) {
        
        int numDUno = (int) (Math.random()*5)+1;
        int numDDos = (int) (Math.random()*5)+1;
        int numDTres = (int) (Math.random()*5)+1;

        System.out.println(numDUno);
        System.out.println(numDDos);
        System.out.println(numDTres);

        int suma = numDUno + numDDos + numDTres;
        System.out.println("La suma de todos es " + suma);

    }

}
