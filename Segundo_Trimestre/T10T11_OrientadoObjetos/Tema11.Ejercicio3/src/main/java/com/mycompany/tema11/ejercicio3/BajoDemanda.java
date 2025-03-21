package com.mycompany.tema11.ejercicio3;

public class BajoDemanda extends Plataforma{
    
    //ATRIBUTOS
    private int anoEstreno;
    private String director;
    
    //CONSTRUCTOS
    public BajoDemanda(String t, int d, String c, int p, int ano, String di){
        
        super(t, d, c, p);
        this.anoEstreno = ano;
        this.director = di;
    }
    
    //GETTERS Y SETTERS

    public int getAnoEstreno() {
        return anoEstreno;
    }

    public String getDirector() {
        return director;
    }

    public void setAnoEstreno(int anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    //toString

    @Override
    public String toString() {
        return "BajoDemanda{" +super.toString() + "anoEstreno=" + anoEstreno + ", director=" + director + '}';
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN BAJO DEMANDA -----------");
        System.out.println("TITULO: " + super.getTitulo());
        System.out.println("DURACION: " + super.getDuracion());
        System.out.println("FECHA ESTRENO: " + this.anoEstreno);
        System.out.println("DIRECTOR: " + this.director);
        
    }

    @Override
    public boolean esContenidoPopular(){
        return super.getPuntuacion() > 8;
    };
    
    
}
