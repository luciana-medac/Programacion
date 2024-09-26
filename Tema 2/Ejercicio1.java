public class Ejercicio1 {
    
    public static void main(String[] args) {
        

        //Primero pregunto las notas y las guardo
        //read.Line --> para pedir un dato por consola

        String notaProgramacion = System.console().readLine("¿Qué nota sacaste en Programación? ");
        int notaProgramacionNum = Integer.parseInt(notaProgramacion);
        String notaBasesDeDatos = System.console().readLine("Introduce tu nota de Bases de Datos ");
        int notaBasesDeDatosNum = Integer.parseInt(notaBasesDeDatos); 
        String notaEntornosDesarrollo = System.console().readLine("Introduce tu nota de Entorno de desarrollo ");
        int notaEntornosDesarrolloNum = Integer.parseInt(notaEntornosDesarrollo);

        //Calcular nota media
        //float es para números decimales
        float notaMedia = (notaProgramacionNum + notaBasesDeDatosNum + notaEntornosDesarrolloNum) /3;

        //Muestro las notas por consola
        System.out.println("Programaciñon" + notaProgramacion);
        System.out.println("Base de Datos" + notaBasesDeDatos);
        System.out.println("Entornos de Desarrollo" + notaEntornosDesarrollo);
        System.out.println("--------------");
        System.out.println("Tu nota media es:" + notaMedia);
    }

}
