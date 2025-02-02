
package com.mycompany.ejercicio5;

public class Atacante extends Jugador{
    
    private int habilidadControl;
    private int potenciaTiro;
    
    public Atacante(int id, String n, String e, int ed, int hC, int pT){
        
        super(ed, n, e, ed);
        this.habilidadControl = hC;
        this.potenciaTiro = pT;
    }

    public int getHabilidadControl() {
        return habilidadControl;
    }

    public int getPotenciaTiro() {
        return potenciaTiro;
    }

    public void setHabilidadControl(int habilidadControl) {
        this.habilidadControl = habilidadControl;
    }

    public void setPotenciaTiro(int potenciaTiro) {
        this.potenciaTiro = potenciaTiro;
    }

    @Override
    public String toString() {
        return super.toString() + "Atacante{" + "habilidadControl=" + habilidadControl + ", potenciaTiro=" + potenciaTiro + '}';
    }
    
    //METODOS ADICIONALES
    
    public int habilidadTotal(){
        
        int a = this.habilidadControl;
        int b = this.potenciaTiro;
        return a + b;
    }
}
