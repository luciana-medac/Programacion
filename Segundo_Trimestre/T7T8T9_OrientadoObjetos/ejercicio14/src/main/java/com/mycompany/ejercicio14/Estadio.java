package com.mycompany.ejercicio14;

public class Estadio {
    private String ciudad;
    private String empresa;
    private Zona grada;
    private Zona tribuna;
    private Zona palco;

    // Constructor que recibe la ciudad y la empresa
    public Estadio(String ciudad, String empresa, Zona g, Zona t, Zona p) {
        this.ciudad = ciudad;
        this.empresa = empresa;
        this.grada = g;
        this.tribuna = t;
        this.palco = p;
    }

    // Método para vender entradas en las zonas
    public void venderEntradasGrada(int numEntradas) {
        grada.venderEntradas(numEntradas);
    }

    public void venderEntradasTribuna(int numEntradas) {
        tribuna.venderEntradas(numEntradas);
    }

    public void venderEntradasPalco(int numEntradas) {
        palco.venderEntradas(numEntradas);
    }

    // Método para mostrar las entradas disponibles en una zona específica
    public void mostrarEntradasDisponibles() {
        System.out.println("Entradas disponibles en Grada: " + grada.mostrarEntradasDisponibles());
        System.out.println("Entradas disponibles en Tribuna: " + tribuna.mostrarEntradasDisponibles());
        System.out.println("Entradas disponibles en Palco: " + palco.mostrarEntradasDisponibles());
    }

    // Método para mostrar el total de entradas disponibles en el estadio
    public int mostrarEntradasDisponiblesTotales() {
        return grada.mostrarEntradasDisponibles() + tribuna.mostrarEntradasDisponibles() + palco.mostrarEntradasDisponibles();
    }

    // Método toString para mostrar la información del estadio
    @Override
    public String toString() {
        return "Estadio en " + ciudad + " gestionado por " + empresa;
    }
}
