public class Ex2 {
    public static void main(String[] args) {
        // a) Matriz de adjacência 3x3 para A, B, C
        int[][] adj = {
            {1, 1, 0}, // A -> A, A -> B
            {0, 0, 1}, // B -> C
            {0, 0, 0}  // C
        };

        System.out.println("Matriz de Adjacência:");
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // b) Elemento da diagonal que indica auto-laço:
        System.out.println("Elemento da diagonal principal que indica auto-laço:");
        for (int i = 0; i < adj.length; i++) {
            System.out.println("Vertice " + (char)('A' + i) + ": " + adj[i][i]);
        }
        System.out.println();

        // c) Verificação de vizinhança (exemplo entre A e B)
        int v1 = 0; // A
        int v2 = 1; // B
        if (adj[v1][v2] == 1) {
            System.out.println("A e B são vizinhos (A -> B)");
        } else {
            System.out.println("A e B não são vizinhos");
        }
    }
}
