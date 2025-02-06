package com.mycompany.ejercicio8;

public class Pymes extends Empresa{

    private String sede;
    private int num_socio;
    
    public Pymes(String n, String c, String s, int nS){
        
        super(n, c);
        this.sede = s;
        this.num_socio = nS;
        
    }

    public String getSede() {
        return sede;
    }

    public int getNum_socio() {
        return num_socio;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNum_socio(int num_socio) {
        this.num_socio = num_socio;
    }

    @Override
    public String toString() {
        return super.toString() + "Pymes{" + "sede=" + sede + ", num_socio=" + num_socio + '}';
    }
    
    
}
