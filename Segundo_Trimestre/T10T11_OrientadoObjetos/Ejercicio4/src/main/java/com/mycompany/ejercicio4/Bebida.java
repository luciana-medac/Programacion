
package com.mycompany.ejercicio4;

public class Bebida {
    
    private String nombre;
    private String marca;
    private int precio;
    
    public Bebida(String n, String m, int p){
        
        this.nombre = n;
        this.marca = m;
        this.precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebida{" + "nombre=" + nombre + ", marca=" + marca + ", precio=" + this.precio + '}';
    }
    
    
    //METODOS ADICIONALES
    
    public void edadUsuario(int e){
        
        if (e >= 18) {
            
            System.out.println("si puede beber");
            
        } else if (e < 18){
        
            System.out.println("no puedes beber");
        } else {
                System.out.println("no se puede leer ese dato");
                }
    }
    
    
    public void precioBebida (int v){
        
        if (v == 1000) {
            
            System.out.println("17");
            
        } else if (v < 1000 && v > 500) {
            
            System.out.println("14");
            
        } else if (v < 500 && v > 0) {
            
            System.out.println("10");
            
        } else {
            System.out.println("error");
        }
        
    }
    
}
