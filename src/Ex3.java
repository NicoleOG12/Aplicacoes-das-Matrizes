public class Ex3 {
    public static void main(String[] args) {
        int[][] pixels = {
            {10, 10, 10, 10},
            {10, 100, 100, 10},
            {10, 100, 100, 10},
            {10, 10, 10, 10}
        };

        System.out.println("Matriz de pixels:");
        printMatrix(pixels);

        // Filtro diagonal
        int[][] filtro = {
            {-1, 0, 1},
            {0, 0, 0},
            {1, 0, -1}
        };

        System.out.println("\nFiltro aplicado para detectar bordas diagonais:");
        printMatrix(filtro);

        System.out.println("\nBordas diagonais são destacadas porque o filtro calcula diferenças de intensidade entre pixels nas diagonais,");
        System.out.println("realçando mudanças abruptas na imagem, especialmente em direção diagonal.");
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
