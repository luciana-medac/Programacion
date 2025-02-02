
package com.mycompany.ejercicio5;


public class Defensor extends Jugador{
    
    private int habilidadDefensa;
    private int resistenciaDefensiva;
    
    public Defensor(int id, String n, String e, int ed, int hD, int rD){
        
        super(id, n, e, ed);
        
        this.habilidadDefensa = hD;
        this.resistenciaDefensiva = rD;
        
    }

    public int getHabilidadDefensa() {
        return habilidadDefensa;
    }

    public int getResistenciaDefensiva() {
        return resistenciaDefensiva;
    }

    public void setHabilidadDefensa(int habilidadDefensa) {
        this.habilidadDefensa = habilidadDefensa;
    }

    public void setResistenciaDefensiva(int resistenciaDefensiva) {
        this.resistenciaDefensiva = resistenciaDefensiva;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensor{" + "habilidadDefensa=" + habilidadDefensa + ", resistenciaDefensiva=" + resistenciaDefensiva + '}';
    }
    
    public int habilidadTotal(){
        
        int a = this.habilidadDefensa;
        int b = this.resistenciaDefensiva;
        return a + b;
        
    }
    
}
