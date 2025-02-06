package com.mycompany.ejercicio8;

public class Gestor {
    
    private String nombre;
    private int num_telef;
    private String email;
    
    public Gestor(String n, int nT, String e){
        
        this.nombre = n;
        this.num_telef = nT;
        this.email = e;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_telef() {
        return num_telef;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_telef(int num_telef) {
        this.num_telef = num_telef;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Gestor{" + "nombre=" + nombre + ", num_telef=" + num_telef + ", email=" + email + '}';
    }
    
    

}
