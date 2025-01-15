package com.mycompany.ejercicio13;

public class Libro {
    
    //ATRIBUTOS
    //Los libros tienen un título, un autor, una editorial y un código, además de un 
    //estado (libre o reservado).
    
    private String titulo;
    private Autor autor;
    private Editorial editorial;
    private int codigo;
    private boolean estado;
    
    //CONSTRUCTOR
    public Libro (String t, Autor a, Editorial e, int c, boolean es){
        
        this.titulo = t;
        this.autor = a;
        this.editorial = e;
        this.codigo = c;
        this.estado = es;
        
    }
    
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isEstado() {
        return estado;
    }
    
    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //toString
    public String toString(){
        
        return "titulo: " + this.titulo + " autor: " + this.autor + " editorial: " + this.editorial + " codigo: " + this.codigo + " estado: " + this.estado;
        
    }
    
    //MOSTRAR LIBROS
    public String mostrarLibros(){
        
        //PRIMERO MUESTRO TODOS LOS LIBROS
        //SI QUIERE RESERVAR O DEVOLVER
        //SI ELIGE RESERVAR UNO DE LOS LIBROS SE MOSTRARÁ SI PUEDE O NO
        //SI ELIGE DEVOLVER UN LIBRO, SE MOSTRARÁ SI LO PUEDE DEVOLVER O NO
        
    }


}
