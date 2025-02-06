package com.mycompany.ejercicio8;

public class GrandeEmpresa extends Empresa{
    
    private String sede;
    private int patrimonio;
    
    public GrandeEmpresa(String n, String c, String s, int p){
        
        super(n, c);
        this.sede = s;
        this.patrimonio = p;
        
    }

    public String getSede() {
        return sede;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    @Override
    public String toString() {
        return super.toString() + "GrandeEmpresa{" + "sede=" + sede + ", patrimonio=" + patrimonio + '}';
    }
    
    

}
