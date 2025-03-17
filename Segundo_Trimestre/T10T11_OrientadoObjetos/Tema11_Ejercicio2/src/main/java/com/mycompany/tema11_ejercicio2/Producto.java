package com.mycompany.tema11_ejercicio2;

public class Producto {
    
    //ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;
    
    //CONSTRUCTOS
    public Producto(String n, double p, int s){
        
        this.nombre = n;
        this.precio = p;
        this.stock = s;
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //toString

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    //MÉTODOS ADICIONALES
    public boolean estaAgotado(){
        
        boolean agotado = true;
        
        if (this.stock == 0 ){
            return agotado;
        } else {
            agotado = false;
            return agotado;
        }
        
    }
    
    public boolean esBajoStock(){
        
        boolean bajo = true;
        if (this.stock < 5) {
            return bajo;
        } else {
            bajo = false;
            return bajo;
        }
        
    }
    
    public int calcularValorStock(){
        
        int precioTotal = (int)this.precio *  this.stock;
        return precioTotal;
    }
    
}
