package ejercicio1;

public class Autobus extends Vehiculo {
    
    //ATRIBUTOS
    private int numPlantas;
    
    //CONSTRUCTOR
    public Autobus(String ma, String mo, String mtc, int km, int p, int d, int nP ){
        super(ma, mo, mtc, km, p, d);
        this.numPlantas = nP;
    }
    
    //GETTERS
    public int getNumPlantas(){
        return this.numPlantas;
    }

    @Override
    public String toString() {
        return "Autobus{" + "numPlantas=" + numPlantas + '}';
    }
    
    //METODOS ADICIONALES
    
}
