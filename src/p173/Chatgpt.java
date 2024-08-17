package p173;

import java.util.Scanner;

public class Chatgpt {
    static final int TAM_MAX = 1000000;

    public static void main(String[] args) {
        casos();
    }

    public static void casos() {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[TAM_MAX];
        char letra, inicial;
        boolean resultadosacado;
        int puntosA, i, puntosB;
        i = 1;
        resultadosacado = false;
        array[0] = 'A';
        puntosB = 0;
        puntosA = 0;

        inicial = sc.next().charAt(0);
        while (inicial != 'F') {
            letra = inicial;
            while (letra != 'F') {
                array[i] = letra;
                if (letra == 'A' && array[i - 1] == 'A') {
                    puntosA++;
                }
                if (letra == 'B' && array[i - 1] == 'B') {
                    puntosB++;
                }
                if ((puntosA >= 9 && puntosA > puntosB + 1) || (puntosB >= 9 && puntosB > puntosA + 1)) {
                    System.out.print(puntosA + "-" + puntosB);
                    resultadosacado = true;
                    puntosA = 0;
                    puntosB = 0;
                }
                letra = sc.next().charAt(0);
                if (resultadosacado && letra != 'F') {
                    System.out.print(" ");
                    resultadosacado = false;
                }
                if (!resultadosacado && letra == 'F') {
                    System.out.print(puntosA + "-" + puntosB);
                    puntosA = 0;
                    puntosB = 0;
                }
                i++;
            }
            System.out.println();
            i = 1;
            array[0] = 'A';
            inicial = sc.next().charAt(0);
            resultadosacado = false;
        }

        sc.close();
    }
}



