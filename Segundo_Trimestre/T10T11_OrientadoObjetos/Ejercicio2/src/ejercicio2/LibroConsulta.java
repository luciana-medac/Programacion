package ejercicio2;

public class LibroConsulta extends Libro{

    private Consulta tipo;
    
    public LibroConsulta(String t, String a, int p, Consulta tipo){
        
        super(t, a, p);
        this.tipo = tipo;
    }
    
    //GETTERS
    public Consulta getTipo(){
        return this.tipo;
    }
    
    //SETTERS
    public void setTipo(Consulta tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "LibroConsulta{" + "tipo=" + tipo + '}';
    }
   
}
