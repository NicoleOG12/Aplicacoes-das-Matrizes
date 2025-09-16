public class Ex4 {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 4, 5},
            {0, 3, 6},
            {0, 0, 7}
        };

        // a) Diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // b) Determinante = produto da diagonal principal (matriz triangular)
        int det = 1;
        for (int i = 0; i < matriz.length; i++) {
            det *= matriz[i][i];
        }
        System.out.println("Determinante: " + det);

        // c) Autovalores da matriz triangular são os elementos da diagonal principal
        System.out.println("Autovalores:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}
