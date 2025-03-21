package com.mycompany.tema11.ejercicio3;

public class Documental extends BajoDemanda{
    
    private String narrador;
    
    public Documental(String t, int d, String c, int p, int ano, String di, String n){
        super(t, d, c, p, ano, di);
        this.narrador = n;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    @Override
    public String toString() {
        return "Documental{" + super.toString() +  "narrador=" + narrador + '}';
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN DOCUMENTAL -----------");
        System.out.println("TITULO: " + super.getTitulo());
        System.out.println("DURACION: " + super.getDuracion());
        System.out.println("FECHA ESTRENO: " + super.getAnoEstreno());
        System.out.println("DIRECTOR: " + super.getDirector());
        System.out.println("NARRADOR: " + this.narrador);
        
    }
    
    @Override
    public boolean esContenidoPopular(){
        return super.getPuntuacion() > 8;
    };
}
