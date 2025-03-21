package com.mycompany.tema11.ejercicio3;

public abstract class Plataforma {
    
    //ATRIBUTOS
    private String titulo;
    private int duracion;
    private String categoria;
    private int puntuacion;
    
    //CONSTRUCTOR
    public Plataforma(String t, int d, String c, int p){
        
        this.titulo = t;
        this.duracion = d;
        this.categoria = c;
        this.puntuacion = p;
        
    }
    
    //GETTERS Y SETTERS

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    //toString

    @Override
    public String toString() {
        return "Evento{" + "titulo=" + titulo + ", duracion=" + duracion + ", categoria=" + categoria + ", puntuacion=" + puntuacion + '}';
    }
    
    //METODOS ADICIONALES
    
    public abstract void mostrarInformacion();
    
    
    public abstract boolean esContenidoPopular();
    
    
}
