package com.mycompany.ejercicio9;

public class Documento {
    
    private String nombreEmp;
    private String CIF;
    private String nombreCli;
    private String DNI;
    private Concepto[] concepto;
    
    
    public Documento(String nEmp, String c, String nCli, String d, Concepto[] con){
        
        this.nombreEmp = nEmp;
        this.CIF = c;
        this.nombreCli = nCli;
        this.DNI = d;
        this.concepto = con;
        
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public String getCIF() {
        return CIF;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public String getDNI() {
        return DNI;
    }

    public Concepto[] getConcepto() {
        return concepto;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setConcepto(Concepto[] concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return "Documento{" + "nombreEmp=" + nombreEmp + ", CIF=" + CIF + ", nombreCli=" + nombreCli + ", DNI=" + DNI + ", concepto=" + concepto + '}';
    }
    
    //METODOS ADICIONALES
    
    public void imprimirDocumento(){
        
        System.out.println("documento");
        
    }
    
}
