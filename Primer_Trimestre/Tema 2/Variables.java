public class Variables {
    
    public static void main(String[] args) {
        
        //Variables --> internamente, el programa va a la memoria y guarda un hueco donde estará la varibale, en caso de querer guardar un dato

        int edadPersona = 25; //"init" es una variable que guarda números enteros 
        String nombreApellidos = "Juanito López"; //"String" es una variable para textos
        
        // char --> sirve para guardar un solo carácter (ej. una sola letra)
        // float --> guarda números decimales 

        //1. Si quiero guardar numeros y letras seguidos --> "00000000H" usaría la variable String
        //2. Si quiero guardar el numero en una variable y la letra en otra variable --> para el número utilizo int y para la letra char


            //System.out.println(edadPersona); //cuando se quiere mostrar un dato guardado de una variable, no se ponen las comillas entre los paréntesis
            //System.out.println(edadPersona+5); //aquí suma 5 al dato que habíamos guardado (no hay necesidad de ponerlo junto, funciona igual)
            //System.out.println(nombreApellidos);
            System.out.println(nombreApellidos + " tiene " + edadPersona + " años ");


    }

}
