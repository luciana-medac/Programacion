package ejercicio2;

public class LibroTexto extends Libro {
    
    //Atributos únicos de esta clase
    private String curso;
    private String asignatura;
    
    public LibroTexto (String t, String a, int p, String c, String as){
        
        //de la clase superiot
        super(t, a, p);
        
        //de esta misma clase
        this.curso = c;
        this.asignatura = as;
        
    }
    
    //GETTERS
    public String getCurso(){
        return this.curso;
    }
    public String getAsignatura(){
        return this.asignatura;
    }
    
    //SETTERS
    public void setCurso(String c){
        this.curso = c;
    }
    public void setAsignatura(String as){
        this.asignatura = as;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + "LibroTexto{" + "curso=" + curso + ", asignatura=" + asignatura + '}';
    }
    

}
