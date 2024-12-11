public class Apunte1 { //Estas llaven engloban todo el código
/*LENGUAJES DE PROGRAMACIÓN:
 * Compilados --> cuando se ejecuta el código, se traduce a 0,1 todo y entonces, empieza a ejecutar
 * Por lo que da igual el orden a seguir (Java, C, C++, C#)
 * 
 * Interpretados --> cuando se ejecuta el código, convierte la línea y la ejecuta, y así continuamente
 * Aquí no da igual el orden (Python, Javascript)
 * 
 * LENGUAJES DE MARCA:
 * HTML
 * 
 * LENGUAJES DE CONSULTA:
 * SQL
 * 
 * MÉTODOS:
 * - Procedimientos
 * - Funciones
 */
    //Método (función o procedimiento)
    //Definiciendo el método (estoy explicando lo que tiene que hacer)
    public static void saludar(){

        System.out.println("Hola");
        System.out.println("Que tal");

    }

    public static void despedirse(){

        System.out.println("Adiós");

    }

    public static void main(String[] args) {
        
        System.out.println("Voy a ejecutar una función");
        saludar(); //invocando al método (se ejecuta en el main)
        System.out.println("...");
        saludar();
        despedirse();

    }

}

/*
 * Procedimiento --> void
 * public status void nombreMetodo (){
 * }
 * 
 * Funciones --> no void
 * public static String nombreFuncion(){
 * return "hola"
 * }
 * 
 * Parámetos de un método --> datos que van dentro del paréntesis (puede tener o no)
 * 
 * Métodos con sobrecarga --> varios métodos con el mismo nombre con distintos parámetros (ejercicio1) | Se llaman igual, 
 * hacen lo mismo pero con diferentes parámetros
 * 
 * Métodos recursivos --> métodos que se llaman/invocan a sí mismos
 * public status String saludar(){
 * return "hola";
 * saludar();
 * }
 * 
 * 
 */
