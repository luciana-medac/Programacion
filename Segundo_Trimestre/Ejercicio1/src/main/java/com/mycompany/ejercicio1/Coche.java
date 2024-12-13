package com.mycompany.ejercicio1; //ESTA LINEA ES IMPORTANTE

//SIEMPRE VA A TENER ESTA ESTRUCTURA TODOS LOS FICHEROS DE UN OBJETO
//1. Creamos los atributos
//2. Creamos el constructor
//3. Creamos los GET
//4. Creamos los SET
// ----------- AQUÍ ES SEGÚN NECESIDAD -----------------------------
//5. Creamos los métodos para imprimir (o los métodos que necesitemos)

//Clase para crear el tipo de dato Coche

//Las clases son las plantillas
public class Coche {
    
    //Atributos (son variables que definen los datos de una clase)
    //Dentro del main son variables, dentro de una clase sin main son atributos
    private String matricula; //usar si es private o public se basa en si necesita usarlo en otra clase
    private String marca; //por ejemplo el constructor es necesario que sea public para poder ejecutar el método en el main
    private String modelo; 
    private String color;
    private int kilometros;
    
    //Método especial para crear coches
    //CONSTRUCTOR
    //1. El nombre del método tiene que coincidir con el nombre de la clase
    //2. No se pone void ni lo que devuelva (no tiene return)
    public Coche(String mtr, String ma, String mo, String co, int km){
        
        this.matricula = mtr; //el atributo matricula se guarda e el parámetro  mtr
        this.marca = ma; //Si siempre es el mismo, se quita su parámetro del paréntesis 
                         //y se cambia por this.marca = "bmw" por ejemplo, entonces ese valor siempre va a ser ese
        this.modelo = mo;
        this.color = co;
        this.kilometros = km;
        
    }
    
    //GETTERS (GET)
    // - Si quiero CONSULTAR un atributo, se usa para devolver el valor
    //Se pone el tipo de dato que devuelve, pero ningún parámetro
    public int getKiometro(){
        return this.kilometros;
    }
    
    public String getMarca(){
        return this.marca;
        
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    
    //SETTERS (SET) --> con ello podemos cambiar el atributo siendo privado
    // - Sirve para poder cambiar un atributo después de crear el objeto
    public void setKilometros(int km){
        //se ejecuta en el main por eso es public
        //le pasamos un parámetro que es el que vamos a modificar
        this.kilometros = km;
        
        //la ventaja de esto es poder usarlo en más cosas, se tiene un mayor control (ej. podemos usarlo con condicionales
    }
    
    //Se necesita un método para cada atributo -->
    public void setColor(String co){
        this.color = co;
    }
    
    public void setMarca(String ma){
        this.marca = ma;
    }
    
    public void setModelo(String mo){
        this.modelo = mo;
    }
    
    public void setMatricula(String mtr){
        this.matricula = mtr;
    }
    
    public void imprimirCoche(){
        System.out.println("El coche con matricula" + this.matricula + " tiene " + this.kilometros);
    }
    
    public void comprobarKm (){
        if(this.kilometros < 50000){
            System.out.println("el coche es seminuevo");
        } else {
            System.out.println("el coche es antiguo");
        }
    }
}



