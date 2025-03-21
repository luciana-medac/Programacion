package com.mycompany.tema11.ejercicio3;

public class Evento extends Plataforma{
    
    //ATRIBUTOS PROPIOS
    private int fecha;
    private int horaInicio;
    private int precioEntrada;
    private int capMaxima;
    private String ubicacion;
    
    //CONSTRUCTOR
    public Evento (String t, int d, String c, int p, int f, int hI, int pE, int cM, String u){
        
        super(t, d, c, p);
        this.fecha = f;
        this.horaInicio = hI;
        this.precioEntrada = pE;
        this.capMaxima = cM;
        this.ubicacion = u;
    }
    
    //GETTERS Y SETTERS PROPIOS

    public int getFecha() {
        return fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    

    
    
    //toString

    @Override
    public String toString() {
        return "Evento{" + super.toString() + "fecha=" + fecha + ", horaInicio=" + horaInicio + ", precioEntrada=" + precioEntrada + ", capMaxima=" + capMaxima + ", ubicacion=" + ubicacion + '}';
    }
    
//    @Override
//    public void mostrarInformacion(){
//        
//    };
    
    @Override
    public boolean esContenidoPopular(){
        return super.getPuntuacion() > 8;
    };
    
    
}
