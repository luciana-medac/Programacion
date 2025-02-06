package com.mycompany.ejercicio9;

public class Presupuesto extends Documento{
    
    private int precioSinIVA;
    
    public Presupuesto(String nEmp, String c, String nCli, String d, Concepto[] con, int pSIVA){
        
        super(nEmp, c, nCli, d, con);
        this.precioSinIVA = pSIVA;
        
    }

    public int getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(int precioSinIVA) {
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
        System.out.println("Concepto: " + super.getConcepto());
        System.out.println("------------------------------");
        System.out.println("Precio total: " + this.precioSinIVA);
        
    }
    
    

}
