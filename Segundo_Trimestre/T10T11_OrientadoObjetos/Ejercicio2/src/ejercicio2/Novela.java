package ejercicio2;

public class Novela extends Libro{
    
    // Novela: hereda e incluye además el tipo: romántica, histórica, policiaca, aventuras
    private tipoNovela tipo;
    
    public Novela(String t, String a, int p, tipoNovela tipo){
        
        super(t, a, p);
        this.tipo = tipo;
    }
    
    //GETTERS
    public tipoNovela getTipo(){
        return this.tipo;
    }
    
    //SETTERS
    public void setTipo(tipoNovela tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  super.toString() + "Novela{" + "tipo=" + tipo + '}';
    }
    
    

}
