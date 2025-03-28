/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema11_ejercicio4;

/**
 *
 * @author molin
 */
public class Grupo {

    //ATRIBUTOS
    private String nombre;
    private Contacto[] listaContactos;
    private int contador;

    //CONSTRUCTOR
    public Grupo(String n, int capacidadMazima) {

        this.nombre = n;
        this.listaContactos = new Contacto[capacidadMazima];
        this.contador = 0;

    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public Contacto[] getListaContactos() {
        return listaContactos;
    }

    public int getContador() {
        return contador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaContactos(Contacto[] listaContactos) {
        this.listaContactos = listaContactos;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //toString
    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + '}';
    }

    //MÉTODOS ADICIONALES
    public void mostrarContactos() {

        for (int i = 0; i < listaContactos.length; i++) {
            System.out.println(listaContactos[i].getNombre());

        }

    }

    public void agregarContacto(Contacto c) {

        listaContactos[contador] = c;
        contador++;

        /*
        SE LE AGREGA A LOS ATRIBUTOS EL CONTADOR
        SE QUITA DEL CONSTRUCTOR EL ARRAY
        productos[contador] = p;
        contador++;
         */
        //IMPRIMIMOS EL ARRAY
        for (int i = 0; i < contador; i++) {
            System.out.println(listaContactos[i].getNombre());

        }

    }

    public void eliminarContacto(String n) {
        for (int i = 0; i < contador; i++) {
            if (listaContactos[i].getNombre().equals(n)) {
                // Mueve los elementos restantes una posición a la izquierda
                for (int j = i; j < contador - 1; j++) {
                    listaContactos[j] = listaContactos[j + 1];
                }

                // Última posición se pone en null y se reduce contador
                listaContactos[contador - 1] = null;
                contador--;
                break;
            }
        }

        // Se imprime solo hasta "contador" para evitar valores null
        System.out.println("LISTA NUEVA:");
        for (int i = 0; i < contador; i++) {
            System.out.println(listaContactos[i].getNombre());
        }
    }

    public String buscarContacto(String n) {

        for (int i = 0; i < contador; i++) {

            if (listaContactos[i].getNombre().equals(n)) {
                return "coincide: " + n;
            }

        }

        return "nada";
    }

}
