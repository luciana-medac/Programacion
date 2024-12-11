public class Ejercicio7 {

    /*
     * Programa que calcula el perímetro y el área de un rectángulo 
     * cuando el usuario le haya dicho los 2 lados
     */


    public static void main(String[] args) {
        
        //Pido datos y los convierto
        Float primerLado = Float.parseFloat( System.console().readLine("¿Cuánto mide el primer lado? "));
        Float segundoLado = Float.parseFloat(System.console().readLine("¿Cuánto mide el segundo lado? "));

        //Hacemos los cáculos
        float resultado = primerLado * segundoLado;
        float perimetro = primerLado + primerLado + segundoLado + segundoLado;
        
        //Mostramos los resultados
        System.out.println("El área del rectángulo será de " + resultado);
        System.out.println("El resultado del perímetro es " + perimetro);

    }
    
}
