package com.mycompany.ejercicioevaluable2;

public class EjercicioEvaluable2 {

    public static void main(String[] args) {

        //Creamos las paradas
        Parada p1 = new Parada("Chamartin");
        Parada p2 = new Parada("Plaza Castilla");
        Parada p3 = new Parada("Cuatro Caminos");
        Parada p4 = new Parada("Tribunal");
        Parada p5 = new Parada("Gran Via");
        Parada p6 = new Parada("Sol");

        //Los añadimos a un array
        Parada[] listametro = {p1, p2, p3, p4, p5, p6};

        Parada p7 = new Parada("Menendez Pelayo");
        Parada p8 = new Parada("Castellana");
        Parada p9 = new Parada("Retiro");
        Parada p10 = new Parada("Bernabeu");
        Parada p11 = new Parada("Prado");

        Parada[] listabus = {p7, p8, p9, p10, p11};

        //Creamos el metro
        Transporte metro1 = new Metro("Metro Madrid", listametro, 3, 5);

        //Creamos el autobus
        Transporte bus1 = new Autobus("busMadrid", listabus, 9, Gasolina.HIBRIDO);

        System.out.println("Elige en qué vas a viajar: 1.Metro o 2.Autobus");
        int tipo = Integer.parseInt(System.console().readLine("elección: "));

        switch (tipo) {
            case 1:
                //Mostramos las paradas
                System.out.println("ELIGE EL ORIGEN: ");
                System.out.println("1. " + p1);
                System.out.println("2. " + p2);
                System.out.println("3. " + p3);
                System.out.println("4. " + p4);
                System.out.println("5. " + p5);
                System.out.println("6. " + p6);

                //El usuario elige su parada de origen
                int origen = Integer.parseInt(System.console().readLine("elección: "));
                //El usuario elige su parada de destino
                System.out.println("ELIGE EL DESTINO: ");
                int destino = Integer.parseInt(System.console().readLine("elección: "));

                //Llamamos al método para calcular el tiempo que hay desde una parada a otra
                CalcularTiempo.calcularTiempo(origen, destino, metro1.getTiempo());
                break;
            case 2:
                System.out.println("ELIGE EL ORIGEN: ");
                System.out.println("1. " + p7);
                System.out.println("2. " + p8);
                System.out.println("3. " + p9);
                System.out.println("4. " + p10);
                System.out.println("5. " + p11);

                int origenDos = Integer.parseInt(System.console().readLine("elección: "));
                System.out.println("ELIGE EL DESTINO: ");
                int destinoDos = Integer.parseInt(System.console().readLine("elección: "));

                CalcularTiempo.calcularTiempo(origenDos, destinoDos, metro1.getTiempo());
                break;
            default:
                throw new AssertionError();
        }


        //Lo estuve intentando hacer por nombre en lugar de con int pero me llevaría más tiempo del que tengo D:
        
//        System.out.println("ELIGE EL ORIGEN Y EL DESTINO: ");
//        System.out.println("1. " + p1);
//        System.out.println("2. " + p2);
//        System.out.println("3. " + p3);
//        System.out.println("4. " + p4);
//        System.out.println("5. " + p5);
//        System.out.println("6. " + p6);
//        String origenDos = System.console().readLine("Nombre parada origen: " );
//        String destinoDos = System.console().readLine("Nombre parada destino: ");
//        
    }
}
