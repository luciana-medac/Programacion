public class prueba {

    public static void main(String[] args) {

        errores -= 1;

        if (errores == 7) {
            System.out.println("___");
            break;
        } else if (errores == 6) {
            System.out.println("  _______");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" _|_ ");
            break;
        } else if (errores == 5) {
            System.out.println("  _______");
            System.out.println("  |    O");
            System.out.println("  |");
            System.out.println(" _|_ ");
            break;
        } else if (errores == 4) {
            System.out.println("  _______");
            System.out.println("  |    O");
            System.out.println("  |   /");
            System.out.println(" _|_ ");
            break;
        }else if (errores == 3) {
            System.out.println("  _______");
            System.out.println("  |    O");
            System.out.println("  |   /|");
            System.out.println(" _|_ ");
            break;
        } else if (errores == 2) {
            System.out.println("  _______");
            System.out.println("  |    O");
            System.out.println("  |   /|/");
            System.out.println(" _|_ ");
            break;
        } else if (errores == 1) {
            System.out.println("  _______");
            System.out.println("  |    O");
            System.out.println("  |   /|/");
            System.out.println(" _|_  /");
            break;
        } else if (errores == 0) {
            System.out.println("  _______");
            System.out.println("  |    O");
            System.out.println("  |   /|/");
            System.out.println(" _|_  //");
            System.out.println();
            System.out.println("Tas muelto");
            break; } else {
                System.out.println("muelto");
            }
    }

}
