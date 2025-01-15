package com.mycompany.ejercicio12;

public class Vivienda {
    
    //ATRIBUTOS
    private String propietario;
    private int valor;
    private String direccion;
    //Reflejamos la relación de cardinalidad 1:N
    private Habitacion[] habitaciones;
    
    //CONSTRUCTOR
    public Vivienda(String p, int v, String d, Habitacion[] h){
        
        this.propietario = p;
        this.valor = v;
        this.direccion = d;
        this.habitaciones = h;
    }
    
    //GETTERS
    public String getPropietario(){
        return this.propietario;
    }
    public int getValor(){
        return this.valor;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public Habitacion[] getHabitaciones() {
        return this.habitaciones;
    }
    
    //SETTERS
    public void setPropietario(String p){
        this.propietario = p;
    }
    public void setValor(int v){
        this.valor = v;
    }
    public void setDireccion(String d){
        this.direccion = d;
    }
    public void setHabitaciones(Habitacion[] h){
        this.habitaciones = h;
    }
    
    //toString
    public String toString(){
        
        return "Propietario: " + this.propietario + " valor de la vivienda: " + this.valor + " direccion: " + this.direccion + "las habitaciones: ";
    }
    
    //Metodo para mostrar las hbitaciones
    public void mostrarHabitaciones(){
        
        for (int i = 0; i < habitaciones.length; i++) {
            
            System.out.println(this.habitaciones[i].getNombre());
        }
        
    }
    
    //Con el metodo de la clase habitacion calculamos el área de la vivienda
    public void mostrarAreaVivienda(){
        int mH = 0;
        for (int i = 0; i < habitaciones.length; i++) {
            mH += habitaciones[i].AreaVivienda();
        }
        //mostramos el área
        System.out.println("El área de la vivienda es: " + mH + "m2");
    }
    
}
