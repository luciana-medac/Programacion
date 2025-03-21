package com.mycompany.tema11.ejercicio3;

public class Serie extends BajoDemanda{
    
    private int numEpisodios;
    private int temporadas;
    
    public Serie(String t, int d, String c, int p, int ano, String di, int nE, int tem){
        super(t, d, c, p, ano, di);
        this.numEpisodios = nE;
        this.temporadas = tem;
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + super.toString() + "numEpisodios=" + numEpisodios + ", temporadas=" + temporadas + '}';
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN SERIE -----------");
        System.out.println("TITULO: " + super.getTitulo());
        System.out.println("DURACION: " + super.getDuracion());
        System.out.println("NUMERO EPISODIOS: " + this.numEpisodios);
        System.out.println("TEMPORADAS: " + this.temporadas);
        System.out.println("FECHA ESTRENO: " + super.getAnoEstreno());
        System.out.println("DIRECTOR: " + super.getDirector());
        
    }
    
    @Override
    public boolean esContenidoPopular(){
        return super.getPuntuacion() > 8;
    };
    
}
