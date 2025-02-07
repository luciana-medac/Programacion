package com.mycompany.ejercicioevaluable2;

/*
    Se le pasa por parámetro la "posicion" de las paradas 
    desde donde sale hasta donde quiere ir
    y el tiempo de duración de las paradas
*/
public class CalcularTiempo {
    
    public static void calcularTiempo(int o, int d, int t){
        
        //se resta el destino con el origen para sacar las paradas que hay
        int parada = d - o;
        
        //se multiplica el número de paradas por el tiempo entre paradas
        System.out.println("La duración de su viaje es de: " + parada * t + " minutos");
        
    }
}

