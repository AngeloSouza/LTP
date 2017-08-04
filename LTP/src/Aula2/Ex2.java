package Aula2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float[] nota = new float[3];
        for (int i = 0; i < 3; i++) {
            do {
                System.out.printf("informe a nota da %d prova \n", i + 1);
                nota[i] = leia.nextFloat();
            } while (nota[i] > 10 && nota[i] < 0);
        }
        
        double notaT = (nota[0]+nota[1]+nota[2])/3;
        String conceit;
        if (notaT >= 7) {
            conceit = "Aprovado";
        } else if (notaT >= 3) {
            conceit = "";
        } else {
            conceit = "Reprovado";
        } 

        System.out.printf("o aluno foi %c \n", conceit);

    }
}
