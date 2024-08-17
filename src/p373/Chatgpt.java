package p373;


import java.util.Scanner;

public class Chatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número de casos de prueba
        int numCasos = scanner.nextInt();
        
        // Procesar cada caso de prueba
        for (int i = 0; i < numCasos; i++) {
            int N = scanner.nextInt();
            long visibles = calcularCubosVisibles(N);
            System.out.println(visibles);
        }
        
        scanner.close();
    }
    
    // Método para calcular el número de cubos visibles
    public static long calcularCubosVisibles(int N) {
        if (N == 1) {
            return 1;
        }
        return 6L * N * N - 12L * N + 8L;
    }
}
