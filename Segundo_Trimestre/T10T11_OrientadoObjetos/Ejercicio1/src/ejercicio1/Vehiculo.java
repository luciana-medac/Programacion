package ejercicio1;

//CLASE PADRE
public class Vehiculo {

    //ATRIBUTOS
    private String marca;
    private String modelo;
    private String matricula;
    private int km;
    private int precio;
    private int descuento;
    
    //CONSTRUCTOR
    public Vehiculo(String ma, String mo, String mtc, int km, int p, int d){
        this.marca = ma;
        this.modelo = mo;
        this.matricula = mtc;
        this.km = km;
        this.precio = p;
        this.descuento = d;
    }
    
    //GETTERS
    public int getPrecio(){
        return this.precio;
    }
    
    public int getDescuento(){
        return this.descuento;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", km=" + km + ", precio=" + precio + '}';
    }
    
    //METODOS ADICIONALES
    
    public void precioDescuento(){
        System.out.println("Precio con descuento: "  + (this.precio - this.descuento));
    }
    
}
