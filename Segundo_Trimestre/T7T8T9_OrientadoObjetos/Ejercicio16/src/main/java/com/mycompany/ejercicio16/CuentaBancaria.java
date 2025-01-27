package com.mycompany.ejercicio16;

public class CuentaBancaria {
    
    private Titular titular;
    private int numCuenta;
    private float saldo;
    
    //CONSTRUCTOR
    public CuentaBancaria(Titular t, int nC, float s){
        
        this.titular = t;
        this.numCuenta = nC;
        this.saldo = s;
        BancoTotal.dineroTotal = s;
        
    }
    
    //GETTERS

    public Titular getTitular() {
        return titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    //SETTERS

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //toString

    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + ", numCuenta=" + numCuenta + ", saldo=" + saldo + '}';
    }
    
    //Debe tener los métodos ingresar, sacar dinero y mostrar saldo
    
    //METODOS ADICIONALES
    
    
    public void ingresarDinero(int n){
        
        this.saldo += n;
        BancoTotal.dineroTotal += n;
        System.out.println(this.saldo + n);
        
    }
    
    public void sacarDinero(int n){
        
        this.saldo -= n;
        BancoTotal.dineroTotal -= n;
        System.out.println(this.saldo - n);
    }
    
    public void mostrarSaldo(){
        System.out.println(this.saldo);
    }
    
}
