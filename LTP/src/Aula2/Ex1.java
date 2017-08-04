
package Aula2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float[] nota = new float[3];
        for (int i = 0; i < 3; i++) {
            do {
                System.out.printf("informe a nota da %d avaliaçao \n", i + 1);
                nota[i] = leia.nextFloat();
            } while (nota[i] > 10 && nota[i] < 0);
        }
        double notaT = (nota[0] * 0.2) + (nota[1] * 0.3) + (nota[2] * 0.5);
        char conceit;
        if (notaT >= 8) {
            conceit = 'A';
        } else if (notaT >= 7) {
            conceit = 'B';
        } else if (notaT >= 6) {
            conceit = 'C';
        } else if (notaT >= 5) {
            conceit = 'D';
        } else {
            conceit = 'E';
        }

        System.out.printf("o aluno ficou com conceito %c \n", conceit);

    }
}
