package com.mycompany.ejercicio14;

public class Zona {
    private String tipo;
    private int plazasTotales;
    private int plazasDisponibles;

    // Constructor que asigna las plazas según el tipo de zona
    public Zona(String tipo) {
        this.tipo = tipo;  // Convertimos a minúsculas para evitar errores de comparación
        asignarPlazas();
    }

    // Asignar el número de plazas basado en el tipo de zona
    private void asignarPlazas() {
        switch (tipo) {
            case "grada":
                plazasTotales = 100; // 100 plazas para la grada
                break;
            case "tribuna":
                plazasTotales = 50;  // 50 plazas para la tribuna
                break;
            case "palco":
                plazasTotales = 20;  // 20 plazas para el palco
                break;
            default:
                System.out.println("Tipo de zona no válido. Debe ser 'grada', 'tribuna' o 'palco'.");
        }
        plazasDisponibles = plazasTotales;  // Inicialmente todas las plazas están disponibles
    }

    // Método para vender entradas en la zona
    public void venderEntradas(int numEntradas) {
        if (numEntradas <= 0) {
            System.out.println("El número de entradas debe ser mayor a 0.");
        } else if (numEntradas > plazasDisponibles) {
            System.out.println("No hay suficientes entradas disponibles en la zona " + tipo + ". Entradas restantes: " + plazasDisponibles);
        } else {
            plazasDisponibles -= numEntradas;  // Reducir el número de plazas disponibles
            System.out.println(numEntradas + " entrada(s) vendida(s) en la zona " + tipo + ". Entradas disponibles: " + plazasDisponibles);
        }
    }

    // Mostrar el número de plazas disponibles en esta zona
    public int mostrarEntradasDisponibles() {
        return plazasDisponibles;
    }

    // Obtener el tipo de zona
    public String getTipo() {
        return tipo;
    }
}
