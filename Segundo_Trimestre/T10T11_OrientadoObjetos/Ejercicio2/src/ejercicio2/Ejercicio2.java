
package ejercicio2;

public class Ejercicio2 {

    /**
     * Crea la superclase Libro, que tenga título, autor y precio y sus métodos
     * habituales. Crea las subclases: - LibroDeTexto: hereda e incluye además
     * ‘curso’ y 'asignatura'. - Novela: hereda e incluye además el tipo:
     * romántica, histórica, policiaca, aventuras. - LibroDivulgativo: incluye
     * área de conocimiento (física, biología, medicina, etc.). - LibroConsulta:
     * pueden ser diccionarios, enciclopedias y diccionarios de idiomas. En el
     * main, crea un objeto de cada tipo e imprímelos por consola para comprobar
     * que se han creado correctamente.
     */
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Lazarillo Tormes", "Anonimo", 10);
        
        LibroTexto libroTexto1 = new LibroTexto("Lengua Castellana", "Santillana", 50, "1Bachillerato", "Lengua");
        
        Novela novela1 = new Novela("La Psicologa", "Antonio", 10, tipoNovela.policiaca);
        
        LibroDivulgativo divulgativo1 = new LibroDivulgativo("Naturaleza en la ciudad", "Anonimo", 30,Conocimiento.biologia );
        
        LibroConsulta consulta1 = new LibroConsulta("Enciclopedia Cuerpo Humano", "BBVA", 50, Consulta.enciclopedia);
        
        System.out.println("PRUEBAS -------------------------");
        System.out.println(libro1);
        System.out.println("PRUEBAS -------------------------");
        System.out.println(libroTexto1);
        System.out.println("PRUEBAS -------------------------");
        System.out.println(novela1);
        System.out.println("PRUEBAS -------------------------");
        System.out.println(divulgativo1);
        System.out.println("PRUEBAS -------------------------");
        System.out.println(consulta1);
        
        
        
    }

}
