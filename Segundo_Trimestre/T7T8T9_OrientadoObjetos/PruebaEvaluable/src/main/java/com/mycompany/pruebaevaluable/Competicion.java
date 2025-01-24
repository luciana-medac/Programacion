package com.mycompany.pruebaevaluable;

public class Competicion {
    
    //ATRIBUTOS
    private String nombre;
    private String pais;
    private Piloto[] pilotos;
    
    //CONSTRUCTOR
    public Competicion(String n, String p, Piloto[] pi){
        
        this.nombre = n;
        this.pais = p;
        this.pilotos = pi;
    }
    
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPilotos(Piloto[] pilotos) {
        this.pilotos = pilotos;
    }
    
    //TOSTRING
    public String toString(){
        return "nombre competicion: " + this.nombre + " pais: " + this.pais + " pilotos: ";
    }
    
    //METODOS ADICIONALES
    
    //Creo que este metodo no lo especifiqué en la hoja
    public void mostrarPilotos(){
        
        for (int i = 0; i < pilotos.length; i++) {
            System.out.println(pilotos[i]);
        }
    }
    
}
