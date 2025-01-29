package ejercicio2;

public class LibroDivulgativo extends Libro{

    private Conocimiento tipo;
    
    public LibroDivulgativo(String t, String a, int p, Conocimiento  tipo){
        
        super(t, a, p);
        this.tipo = tipo;
    }
    
    //GETTERS
    public Conocimiento getTipo(){
        return this.tipo;
    }
    
    //SETTERS
    public void setTipo(Conocimiento tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()  + "LibroDivulgativo{" + "tipo=" + tipo + '}';
    }
    
    
}
