package com.mycompany.tema11_ejercicio2;

public class Seccion {
    
    //ATRIBUTO
    private String nombre;
    private Producto[] productos;
    
    //CONSTRUCTOR
    public Seccion(String n, Producto[] p){
        
        this.nombre = n;
        this.productos = p;
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Seccion{" + "nombre=" + nombre + ", productos=" + productos + '}';
    }
    
    //METODOS ADICIONALES
    public String[] productosBajoStock(){
        
        int stock = 0;
        
        Producto[] p2;
        
        for (int i = 0; i < productos.length; i++) {
            
            if (productos[i].getStock() > 5) {
                stock++;
            }
           
        }
        
        String[] p1 = new String[stock];
        int contar = 0;
        
        for (int i = 0; i < p1.length; i++) {
            p1[contar] = productos[i].getNombre();
            contar++;
        }
        return p1;
    }

    public void mostrarNombre(){
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i].getNombre());
            
        }
        
    }
    
    public double calcularValorTotalStock(){
        
        double total = 0;
        
        for (int i = 0; i < productos.length; i++) {
            
            total += productos[i].getPrecio();
            
        }
        
        return total;
        
    }
}
