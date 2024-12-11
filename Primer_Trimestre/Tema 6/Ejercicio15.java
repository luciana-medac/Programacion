public class Ejercicio15 {

        public static void main(String[] args) {
        
                int[] numR = new int[10];
                int num = 101;
        
                // Rellenamos de números aleatorios
                for (int i = 0; i < numR.length; i++) {
                    numR[i] = (int) (Math.random() * 101);
                }
        
                ////////////////////////////////ORDENAR ARRAY////////////////////////////////
        
        
                int[] ordenado = new int[10];
                int posicion = 0;
        
                for (int i = numR.length - 1; i >= 0; i--) {
        
                    for (int j = 0; j < numR.length; j++) {
        
                        if (numR[j] > num) { 
                            num = numR[j]; 
                            posicion = j; 
                        }
                    }
        
                    ordenado[i] = num; 
                    numR[posicion] = 0; 
                    num = 0; 
                }
        
                System.out.println("array ordenado: ");
                for (int q = 0; q < ordenado.length; q++) {
                    System.out.println(ordenado[q]);
                }
        
            }
}
