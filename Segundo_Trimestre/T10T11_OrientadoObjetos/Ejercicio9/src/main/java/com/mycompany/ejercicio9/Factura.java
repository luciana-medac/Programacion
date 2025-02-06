package com.mycompany.ejercicio9;

public class Factura extends Documento{

    private int numeracion;
    private float precioConIVA;
    
    public Factura(String nEmp, String c, String nCli, String d, Concepto[] con, int num, float pIVA){

        super(nEmp, c, nCli, d, con);
        this.numeracion = num;
        this.precioConIVA = pIVA * 1.21f;
        
    }

    public int getNumeracion() {
        return numeracion;
    }

    public float getPrecioConIVA() {
        return precioConIVA;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public void setPrecioConIVA(float precioConIVA) {
        this.precioConIVA = precioConIVA;
    }

    @Override
    public String toString() {
        return super.toString() + "Factura{" + "numeracion=" + numeracion + ", precioConIVA=" + precioConIVA + '}';
    }
    
    @Override
    public void imprimirDocumento(){
        
        
        System.out.println("---------- FACTURA ----------");
        System.out.println("Numero Factura: " + this.numeracion);
        System.out.println("Nombre empresa: " + super.getNombreEmp() + "CIF:" + super.getCIF());
        System.out.println("Nombre cliente: " + super.getNombreCli() + "DNI: " + super.getDNI());
        System.out.println("------------------------------");
       
        for (int i = 0; i < super.getConcepto().length; i++) {
            
            System.out.println(super.getConcepto()[i].getDescripcion()); 
            System.out.println(super.getConcepto()[i].getPrecio());
            
        }
    
        System.out.println("------------------------------");
        System.out.println("Precio total: " + this.precioConIVA);
        
    }
    
    
    
   
}
