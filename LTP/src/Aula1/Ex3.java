package Aula1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        int[] z = new int[3];

        for (int i = 0; i < 3; i++) {
            do {
                System.out.printf("informe o valor de x%d: ", i + 1);
                x[i] = leia.nextInt();
            } while (x[i] < 0 || x[i] > 9);
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            do {
                System.out.printf("informe o valor de y%d: ", i + 1);
                y[i] = leia.nextInt();
            } while (y[i] < 0 || y[i] > 9);
        }

        int X = x[0] * x[1] * x[2];
        int Y = y[0] * y[1] * y[2];

        for (int i = 0; i < 3; i++) {
            z[i] = (x[i] * y[i]) % 10;
        }

        int Z = z[0] * z[1] * z[2];
        
        System.out.println("");

        System.out.printf("o valor total de z é: %d ", Z);

    }
}
