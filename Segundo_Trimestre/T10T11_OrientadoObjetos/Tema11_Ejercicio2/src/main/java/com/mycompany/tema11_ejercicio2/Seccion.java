package com.mycompany.tema11_ejercicio2;

public class Seccion {
    
    //ATRIBUTO
    private String nombre;
    private Producto[] productos;
    
    //CONSTRUCTOR
    public Seccion(String n, Producto[] p){
        
        this.nombre = n;
        this.productos = p;
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Seccion{" + "nombre=" + nombre + ", productos=" + productos + '}';
    }
    
    //METODOS ADICIONALES
    
    public String productosBajoStock(){
        
        //OTRA FORMA
        String listaBajoStock = " ";
        for (int i = 0; i < productos.length; i++) {
            listaBajoStock = listaBajoStock + productos[i].getNombre() + " , ";
            
        }
        
        return listaBajoStock;
        
        /*
        int stock = 0;
        Producto[] p2;
        
        for (int i = 0; i < productos.length; i++) {
            
            if (productos[i].getStock() > 5) {
                stock++;
            }
           
        }
        
        String[] p1 = new String[stock];
        int contar = 0;
        
        for (int i = 0; i < p1.length; i++) {
            
            p1[contar] = productos[i].getNombre();
            contar++;
        }
        
        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1);
            
        }
        
        return p1;
        Producto[] listaProductos;
        
        int cantidad = 0;
        
        for (int i = 0; i < listaProductos.length; i++) {
            if (listaProductos[i].esBajoStock()) {
                cantidad++;
            }
            
        }
        
        Producto[] listaProductosBajoStock = new Producto[cantidad];
        
        int contador = 0;
        for (int i = 0; i < listaProductosBajoStock.length; i++) {
            if (listaProductos[i].esBajoStock()) {
                listaProductosBajoStock[contador] = listaProductos[i];
                contador ++;
            }
            
        }
        */
        
    }
    
    
    
    
    

    public void mostrarNombre(){
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i].getNombre());
            
        }
        
    }
    
    
    
    public void agregarProducto(Producto p){
        
        /*
        String nombre = System.console().readLine("Nombre producto: ");
        double precio = Double.valueOf(System.console().readLine("Precio: "));
        int stock = Integer.parseInt(System.console().readLine("Stock: "));
        
        Producto p0 = new Producto(nombre, precio, stock);
        
        return p0;
        */
        
        /*
        
        SE LE AGREGA A LOS ATRIBUTOS EL CONTADOR
        SE QUITA DEL CONSTRUCTOR EL ARRAY
        productos[contador] = p;
        contador++;
        */
        
    }
    
    /*
    public void imprimirListaProducto(){
        
        for (int i = 0; i < contador.length; i++) {
            System.out.println(productos[i].getNombre());
            
        }
        
    }
    */
    
    
    public double calcularValorTotalStock(){
        
        double total = 0;
        
        for (int i = 0; i < productos.length; i++) {
            
            total += productos[i].getPrecio();
            
        }
        
        return total;
        
    }
}
