public class Ex1 {
    public static void main(String[] args) {
        // a) Sistema linear correspondente:
        System.out.println("Sistema linear:");
        System.out.println("3x + 1y = b1");
        System.out.println("2x + 4y = b2\n");

        // b) Diagonal principal da matriz:
        int[][] matriz = { 
            {3, 1}, 
            {2, 4} 
        };
        
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }
        System.out.println();

        // c) Explicação:
        System.out.println("A diagonal principal é usada no método de Gauss-Seidel para dividir e atualizar o valor das variáveis em cada iteração,");
        System.out.println("garantindo que o cálculo seja estável e convergente quando esses valores forem dominantes.");
    }
}
