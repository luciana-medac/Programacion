package ejercicio2;

public class Libro {
    
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int precio;
    
    //CONSTRUCTOR
    public Libro (String t, String a, int p){
        
        this.titulo = t;
        this.autor = a;
        this.precio = p;
    }
    
    //GETTERS
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getPrecio(){
        return this.precio;
    }
    
    //SETTERS
    public void setTitulo(String t){
        this.titulo = t;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public void setPrecio(int p){
        this.precio = p;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    

}
