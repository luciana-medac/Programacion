public class cartas {

    public static void carta(int p1) {

        int numCaRam = p1;

                switch (numCaRam) {
                    case 1:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de diamantes");
                        } else if (numCaRam == 11) {
                            System.out.println("J de diamantes");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de diamantes");
                        } else if (numCaRam == 13) {
                            System.out.println("K de diamantes");
                        } else {
                            System.out.println(numCaRam + " de diamantes");
                        }
                        break;
                    case 2:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de corazones");
                        } else if (numCaRam == 11) {
                            System.out.println("J de corazones");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de corazones");
                        } else if (numCaRam == 13) {
                            System.out.println("K de corazones");
                        } else {
                            System.out.println(numCaRam + " de corazones");
                        }
                        break;
                    case 3:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de picas");
                        } else if (numCaRam == 11) {
                            System.out.println("J de picas");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de picas");
                        } else if (numCaRam == 13) {
                            System.out.println("K de picas");
                        } else {
                            System.out.println(numCaRam + " de picas");
                        }
                        break;
                    case 4:
                        numCaRam = (int) (Math.random() * 12) + 1;
                        if (numCaRam == 1) {
                            System.out.println("A de treboles");
                        } else if (numCaRam == 11) {
                            System.out.println("J de treboles");
                        } else if (numCaRam == 12) {
                            System.out.println("Q de treboles");
                        } else if (numCaRam == 13) {
                            System.out.println("K de treboles");
                        } else {
                            System.out.println(numCaRam + " de treboles");
                        }
                        break;
                    default:
                        break;
                }

    }

    public static void main(String[] args) {

        System.out.println("7.palo concreto");
        System.out.println("8.random");
        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 7:
                //Se muestran las opciones del 1 al 4
                System.out.println("Los palos son:");
                System.out.println("1. Diamantes");
                System.out.println("2. Corazones");
                System.out.println("3.Picas");
                System.out.println("4.Picas");
                int opcionPalo = Integer.parseInt(System.console().readLine());
                //el método comprueba y manda
                carta(opcionPalo);
                break;
            case 8:
                //Se genera el número random
                int numR = (int)(Math.random()*3)+1;
                //El método comprueba y se manda
                carta(numR);
            default:
                break;
        }

    }

}
