package com.mycompany.ejercicio9;

public class Presupuesto extends Documento{
    
    private float precioSinIVA;
    
    public Presupuesto(String nEmp, String c, String nCli, String d, Concepto[] con, float pSIVA){
        
        super(nEmp, c, nCli, d, con);
        this.precioSinIVA = pSIVA;
        
    }

    public float getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(float precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    @Override
    public String toString() {
        return super.toString() + "Presupuesto{" + "precioSinIVA=" + precioSinIVA + '}';
    }
    
    //METODOS ADICIONALES
    
    @Override
    public void imprimirDocumento(){
        
        System.out.println("---------- PRESUPUESTO ----------");
        System.out.println("Nombre empresa: " + super.getNombreEmp() + "CIF:" + super.getCIF());
        System.out.println("Nombre cliente: " + super.getNombreCli() + "DNI: " + super.getDNI());
        System.out.println("------------------------------");
        
        for (int i = 0; i < super.getConcepto().length; i++) {
            
            System.out.println(super.getConcepto()[i].getDescripcion());
            System.out.println(super.getConcepto()[i].getPrecio());
            
        }
        
        System.out.println("------------------------------");
        System.out.println("Precio total: " + this.precioSinIVA);
        
    }
    
    

}
