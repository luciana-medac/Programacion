package com.mycompany.tema11.ejercicio3;

public class Concierto extends Evento{

    //ATRIBUTOS PROPIOS
    private String artista;
    
    //CONSTRUCTOR
    public Concierto(String t, int d, String c, int p, int f, int hI, int pE, int cM, String u, String a){
        
        super(t, d, c, p, f, hI, pE, cM, u);
        this.artista = a;
    }
    
    //GETTERS Y SETTERS PROPIOS

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    //toString

    @Override
    public String toString() {
        return "Concierto{" + super.toString() +  "artista=" + artista + '}';
    }
    
   
    @Override
    public void mostrarInformacion(){
        
        System.out.println("INFORMACIÓN DEL CONCIERTO -----------");
        System.out.println("ARTISTA: " + this.artista);
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
