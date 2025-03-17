package com.mycompany.tema11_ejercicio1;

public class Vuelo {
    
    //ATRIBUTOS
    private String origen;
    private String destino;
    private int duracion;
    private int num_pasajeros;
    private double distancia;
    private double precio_base;
    
    //CONSTRUCTOR
    
    public Vuelo (String o, String des, int du, int nP, double dis, double pB){
        
        this.origen = o;
        this.destino = des;
        this.duracion = du;
        this.num_pasajeros = nP;
        this.distancia = dis;
        this.precio_base = pB;
        
    }
    
    //GETTERS
    
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPrecio_base() {
        return precio_base;
    }
    
    //SETTERS
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNum_pasajeros(int num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
    
    //toString

    @Override
    public String toString() {
        return "Vuelo{" + "origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + ", num_pasajeros=" + num_pasajeros + ", distancia=" + distancia + ", precio_base=" + precio_base + '}';
    }
    
    
    //MÉTODOS
    
    public void calcularIngresosTotales(){
        
        
        
        if (this.distancia < 5000) {
            
            System.out.println( "Precio total:" + (this.precio_base * this.num_pasajeros));
            
        } else {
            double precioNormal = (this.precio_base * this.num_pasajeros);
            double precioTotal =  ((this.precio_base * this.num_pasajeros)*0.10) + precioNormal;
            
            System.out.println( "Precio total con 10% recargo:" + precioTotal);
        }
        
        
    }
    
    public void calcularCombustible(){
        
        double combTotal = this.distancia * 4;
        
        System.out.println("Combustible total gastado: " + combTotal);
        
    }
    
    public boolean esVueloLargo(){
        
        if (this.duracion > 300) {
            return true;
        } else {
            return false;
        }
        
    }
         

}
