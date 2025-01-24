package ejercicio1;

//Cuando se hereda, al crear la clase se añade "extends nombre_clase_padre"
public class Coche extends Vehiculo {

    //ATRIBUTOS
    //Los de vehiculo no se ponen, se ponen solo los exclusivos de esta clase
    private int numPuertas;
    
    //CONSTRUCTOR
    public Coche(String ma, String mo, String mtc, int km, int p, int d, int nP){
        //Los de la clase padre, se llama super(), es decir, llamo al constructor de la clase padre
        super(ma, mo, mtc, km, p, d); //Es importante ponerlo en el mismo orden que el constructor de la clase padre(vehiculo)
        //Los que sean de esta clase, se crean como siempre
        this.numPuertas = nP;
    }
    
    //SOLO SE HACEN LOS GETTERS Y SETTERS DE ESTA CLASE, LOS DEL PADRE YA ESTÁN HECHOS EN SU CLASE
    
     /*
    public void precioDescuento(){
        //Siempre que quiera acceder a algo de la clase padre, uso el super
        System.out.println("Precio con descuento: " + (super.getPrecio() - this.decuento) );
    }
    */
    
    //En el toString del hijo podemos llamar al toString del padre
    @Override
    public String toString() {
        return "Coche{" + super.toString() + "numPuertas=" + numPuertas + '}';
    }
    
    
}
