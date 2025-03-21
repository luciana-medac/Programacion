package com.mycompany.tema11.ejercicio3;

public class Deporte extends Evento{

    //ATRIBUTOS PROPIOS
    private String nombresEquipos;
    
    //CONSTRUCTOR
    public Deporte(String t, int d, String c, int p, int f, int hI, int pE, int cM, String u, String nE){
        
        super(t, d, c, p, f, hI, pE, cM, u);
        this.nombresEquipos = nE;
    }
    
    //GETTERS Y SETTERS

    public String getNombresEquipos() {
        return nombresEquipos;
    }

    public void setNombresEquipos(String nombresEquipos) {
        this.nombresEquipos = nombresEquipos;
    }

    @Override
    public String toString() {
        return "Deporte{" +super.toString() + "nombresEquipos=" + nombresEquipos + '}';
    }
    
    @Override
    public void mostrarInformacion(){
        
        System.out.println("INFORMACIÓN DEL EVENTO DEPORTIVO -----------");
        System.out.println("EQUIPOS: " + this.nombresEquipos);
        System.out.println("TOUR: " + super.getTitulo());
        System.out.println("DURACION: " + super.getDuracion());
        System.out.println("FECHA: " + super.getFecha());
        System.out.println("HORA INICIO: " + super.getHoraInicio());
        System.out.println("PRECIO ENTRADA: " + super.getPrecioEntrada());
        System.out.println("AFORO: " + super.getCapMaxima());
        System.out.println("UBICACION: " + super.getUbicacion());
    };
    
    @Override
    public boolean esContenidoPopular(){
        return super.getPuntuacion() > 8;
    };
}
