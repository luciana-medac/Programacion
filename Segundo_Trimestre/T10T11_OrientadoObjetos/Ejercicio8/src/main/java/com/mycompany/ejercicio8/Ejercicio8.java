package com.mycompany.ejercicio8;

/**
 * Una gestoría trabaja con varios tipos de empresas (autónomos, pymes y grandes
 * empresas). Por supuesto, en la gestoría trabajan gestores.
 *
 *
 * Su software de gestión debe poder clasificar a las empresas: - Todas tienen
 * nombre y CIF. - Las pymes también tienen sede y número de socios. - Las
 * grandes empresas también tienen sede y patrimonio (en euros).
 *
 * Por otro lado, los gestores tienen nombre, número de teléfono y email. La
 * gestoría asigna 1 gestor a los autónomos, 2 gestores a las pymes y 5 gestores
 * a las grandes empresas. Crea 10 gestores en el main y asignarlos en función
 * de las empresas que se creen. (La asignación de gestores a las empresas debe
 * hacerse en la clase Gestoría) (En el main se crean los gestores y las
 * empresas y se le pasan a la Gestoría para que asigne).
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Gestor g1 = new Gestor("Martin", 666777888, "email@uno.com");
        Gestor g2 = new Gestor("Marcos", 888554123, "email@dos.com");
        Gestor g3 = new Gestor("Ana", 455561234, "email@tres.com");
        Gestor g4 = new Gestor("Martina", 366111544, "email@cuatro.com");
        Gestor g5 = new Gestor("Carlos", 775555123, "email@cinco.com");
        Gestor g6 = new Gestor("Sara", 888444555, "email@seis.com");
        Gestor g7 = new Gestor("Juan", 777444222, "email@siete.com");
        Gestor g8 = new Gestor("Maria", 888456321, "email@ocho.com");
        Gestor g9 = new Gestor("Carla", 222443166, "email@nueve.com");
        Gestor g10 = new Gestor("Samanta", 555221113, "email@diez.com");
        
        //CREAMOS LAS EMPRESAS
        Empresa au1 = new Autonomo ("carniceria Juan", "B4513245");
        
        Empresa pyme1 = new Pymes("TetrisSL", "B2954685", "Sede Jaen", 888);
        
        Empresa gE1 = new GrandeEmpresa("Sony", "B2945651", "Sede Madrid", 999);
        
        
        Gestoria.asignarGestores(g1, gE1);
        Gestoria.asignarGestores(g2, gE1);
        Gestoria.asignarGestores(g3, gE1);
        Gestoria.asignarGestores(g4, gE1);
        Gestoria.asignarGestores(g5, gE1);
        
        Gestoria.asignarGestores(g6, pyme1);
        Gestoria.asignarGestores(g7, pyme1);
        
        Gestoria.asignarGestores(g9, au1);
        
        
        
    }
}
