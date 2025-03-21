package com.mycompany.tema11.ejercicio3;

public class Pelicula extends BajoDemanda{
    
    //ATRIBUTO
    private int presupuesto;
    
    //CONSTRUCTO
    public Pelicula(String t, int d, String c, int p, int ano, String di, int pre){
        super(t, d, c, p, ano, di);
        this.presupuesto = pre;
        
    }
    
    //GETTERS Y SETTERS

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Pelicula{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }
    
    
}
