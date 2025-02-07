package com.mycompany.ejercicioevaluable2;

public class Metro extends Transporte{
    
    //ATRIBUTOS
    private int numVagones;
    
    //CONSTRUCTOR
    public Metro(String n, Parada[] p, int t, int nV){
        
        super(n, p, t);
        this.numVagones = nV;
        
    }
    
    //GETTERS

    public int getNumVagones() {
        return numVagones;
    }
    
    //SETTERS

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return super.toString() + "Metro{" + "numVagones=" + numVagones + '}';
    }
    
}
