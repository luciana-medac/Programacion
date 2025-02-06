package com.mycompany.ejercicio9;

/**
 * Un software debe poder crear facturas y presupuestos. En ambos documentos se
 * debe conocer el nombre de la empresa, el nombre del cliente, el DNI/CIF de
 * ambos, el concepto o conceptos cada uno con sus precios (máximo 5 conceptos
 * en cada factura o presupuesto). Las facturas también deben tener una
 * numeración y un precio total (con IVA). Los presupuestos también deben tener
 * un precio total (sin IVA). En el main, crea facturas y presupuestos de
 * prueba, añadiendo productos. Una vez añadidos, debes tener y llamar a un
 * método imprimirDocumento() o similar, que imprima por consola la palabra
 * “Factura” o “Presupuesto” seguida de todos los datos.
 *
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        
        Concepto c1 = new Concepto("producto1", 123);
        Concepto c2 = new Concepto("producto2", 123);
        
        Concepto[] conceptos1 = {c1, c2};
        
        
        
        
        Documento doc1 = new Factura("TetrisSL", "B2965112", "Martin Galileo", "7828451D", conceptos1 ,001, 0);
        
        doc1.imprimirDocumento();
        
    }
}
