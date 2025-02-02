
package com.mycompany.ejercicio5;

/**
 * CLASE PADRE
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private String equipo;
    private int edad;
    
    public Jugador(int id, String n, String e, int ed){
        
        this.id = id;
        this.nombre = n;
        this.equipo = e;
        this.edad = ed;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", equipo=" + equipo + ", edad=" + edad + '}';
    }
    
    
    
}
