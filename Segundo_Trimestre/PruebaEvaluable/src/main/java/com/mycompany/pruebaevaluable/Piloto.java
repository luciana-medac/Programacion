package com.mycompany.pruebaevaluable;

public class Piloto {
    
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private int tiempo;
    
    //CONSTRUCTOR
    public Piloto(String n, int e){
        
        this.nombre = n;
        this.edad = e;
        this.tiempo = 0;
    }
    
    //GETTERS

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTiempo() {
        return this.tiempo;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    //TOSTRING
    public String toString(){
        return "nombre: " + this.nombre + " edad: " + this.edad + " tiempo: " + this.tiempo;
    }
    
    //METODOS ADICIONALES
    
    public void MVPCompeticion(int r){
        
        r = 0;
        if (r < this.tiempo) {
            System.out.println( "El MVP está siendo" + this.nombre);
        } else{
            System.out.println("no hay MVP todavia");
        }
    }
    
    public void introducirTiempo(int t){
        
        this.tiempo += t;
        System.out.println(this.nombre + " su tiempo" + this.tiempo);
    }
    
    

}
