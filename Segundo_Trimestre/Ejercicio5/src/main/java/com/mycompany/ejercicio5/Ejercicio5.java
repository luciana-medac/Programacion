package com.mycompany.ejercicio5;

//import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
    
        //Podemos tener mñas de un constructor, tener sobrecarga de constructores
        //Por ejemplo, crear otro constrducto que si no le dice la Nacionalidad, por defecto 
        //va a ser Español,
        
        //GETTERS
        //Informa sobre un atributo
        //public int getEdad(){
        //return;
        
        //SETTER
        //Modiciar kis valores de kas atributos
        //publiv voif setEdad (int e) {
        
            //return this.edad;}
    
        //piblic String toString (){}
    
    /* 
    Planetas del sistema solar. Se necesita un programa que modele el conecpto
    de planeta del sistema solar
    
    - Un planeta tiene los siguientes datos: nombre, número de satélites, diametro, distancia al sol
    tipo (gaseoso, terreste, enano) y si es observable o no
    
    - Metodos habituales
    - Main: crea 3 planetas del sistema solar e imprimelos (junto cn sus propiedades) por orden de
    más cercano al sol a más lejano
    */
    
    Planeta planeta1 = new Planeta ("Marte", 2, 6779, 228000000, "rocoso", true);
    Planeta planeta2 = new Planeta ("Jupiter", 4, 143000, 78000000, "gaseoso", false);
    Planeta planeta3 = new Planeta ("Ceres", 1, 1000, 420000000, "enano", false);
    
    System.out.println(planeta1); //Esto se usa con el toString (no se llama al método)
    
    }
}
