
package com.mycompany.ejercicio5;


public class Defensor extends Jugador{
    
    private int habilidadDefensa;
    
    public Defensor(int id, String n, String e, int ed, int hD){
        
        super(id, n, e, ed);
        
        this.habilidadDefensa = hD;
        
    }

    public int getHabilidadDefensa() {
        return habilidadDefensa;
    }


    public void setHabilidadDefensa(int habilidadDefensa) {
        this.habilidadDefensa = habilidadDefensa;
    }


    @Override
    public String toString() {
        return super.toString() + "Defensor{" + "habilidadDefensa=" + habilidadDefensa + '}';
    }
    
    public int habilidadTotal(){
        
        int a = this.habilidadDefensa;
        return a;
        
    }
    
}
