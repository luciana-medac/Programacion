package com.mycompany.ejemplo2;

public class Equipo {

    private String nombre;
    private String ciudad;
    private int numSocio;
    private Jugador[] jugadores;
    
    //Cosntructor
    public Equipo(String n, String c, int nS, Jugador[] j){
        this.nombre = n;
        this.ciudad = c;
        this.numSocio = nS;
        this.jugadores = j;
    }
    
    //GETTERS
    
    
    //SETTERS
    
    //TOSTRING
    public String toString(){
        return "El equipo " + this.nombre + " de " + this.ciudad + this.numSocio + this.jugadores;
    }
    
    //Metodos adicionales
    
    public void mostrarNombres(){
    for (int i = 0; i < jugadores.length; i++) {
            System.out.println(this.jugadores[i].getNombre());
    }
    }
    
}
