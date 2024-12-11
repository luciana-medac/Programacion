package com.mycompany.ejercicio1;

//Clase para crear el tipo de dato Coche

//Las clases son las plantillas
public class Coche {
    
    //Atributos (son variables que definen los datos de una clase)
    //Dentro del main son variables, dentro de una clase sin main son atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int kilometros;
    
    //Método especial para crear coches
    //CONSTRUCTOR
    public Coche(String mtr, String ma, String mo, String co, int km){
        
        this.matricula = mtr; //el atributo matricula se guarda e el parámetro  mtr
        this.marca = ma;
        this.modelo = mo;
        this.color = co;
        this.kilometros = km;
        
    }
    
    public void imprimirCoche(){
        System.out.println("El coche con matricula" + this.matricula + " tiene " + this.kilometros);
    }
    
}



