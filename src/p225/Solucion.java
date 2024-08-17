package p225;

import java.util.Scanner;

public class Solucion {

    // Definimos el módulo
    private static final int MOD = 1000000007;

    // Función para calcular Fn(x, y)
    public static long calcularFn(int n, int x, int y) {
        if (n == 0) {
            return x % MOD;
        } else if (n == 1) {
            return y % MOD;
        }

        long a = x % MOD;
        long b = y % MOD;
        long result = 0;
        
        for (int i = 2; i <= n; i++) {
        	System.out.println(a+" "+b);
            result = (a + b) % MOD;
            a = b;
            b = result;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee la entrada completa
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Calcula y muestra el resultado para cada caso de prueba
            System.out.println(calcularFn(n, x, y));
        }

        scanner.close();
    }
}

