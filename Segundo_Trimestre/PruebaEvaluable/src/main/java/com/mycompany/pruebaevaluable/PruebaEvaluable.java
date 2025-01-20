
package com.mycompany.pruebaevaluable;

public class PruebaEvaluable {

    public static void main(String[] args) {
        
        //CREAMOS LOS PILOTOS
        Piloto piloto1 = new Piloto("Matias", 23);
        Piloto piloto2 = new Piloto("Juan", 24);
        Piloto piloto3 = new Piloto("Mark", 25);
        //LOS AÑADIMOS A UN ARRAY
        Piloto[] pilotos1 = {piloto1, piloto2, piloto3};
        
        //CREAMOS LA COMPETICION, JUNTO CON EL ARRAY DE PILOTOS
        Competicion competicion1= new Competicion("Copa1", "Japon", pilotos1);
        
        //UNA VARIABLE QUE DETERMINE EL NÚMERO DE PILOTOS QUE HAY EN LA COMPETICION
        int numPilotos = pilotos1.length;
        
        //INTRODUCIRÁ EL TIEMPO DEL PILOTO QUE ELIJA, HASTA QUE HAYA INTRODUCIDO TODOS
        for (int i = 0; i < pilotos1.length; i++) {
            
            System.out.println("ELIGE EL PILOTO DEL QUE QUIERES GUARDAR EL TIEMPO:");
        
            System.out.println("1." + piloto1);
            System.out.println("2. " + piloto2);
            System.out.println("3. " + piloto3);
        
        
            int opcion = Integer.parseInt(System.console().readLine("opcion: "));
       
            switch (opcion) {
                case 1:
                    int tiempo1 = Integer.parseInt(System.console().readLine("tiempo: "));
                    piloto1.introducirTiempo(tiempo1);
                    piloto1.MVPCompeticion(tiempo1); //para guardar el tiempo
                    break;
                case 2:
                    int tiempo2 = Integer.parseInt(System.console().readLine("tiempo: "));
                    piloto2.introducirTiempo(tiempo2);
                    piloto2.MVPCompeticion(tiempo2);
                    break;
                case 3:
                    int tiempo3 = Integer.parseInt(System.console().readLine("tiempo: "));
                    piloto3.introducirTiempo(tiempo3);
                    piloto3.MVPCompeticion(tiempo3);
                    break;
                default:
                    throw new AssertionError();
                }
            
            //Tendría que mejorar el bucle
        }
        
        
    }
}
    
       
        
    

