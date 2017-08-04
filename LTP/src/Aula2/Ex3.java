package Aula2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numero = new int[4];
        int aux;
        for (int i = 0; i < 4; i++) {
            System.out.printf("informe o %d numero \n", i + 1);
            numero[i] = leia.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (numero[j] > numero[j + 1]) {
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d - %d  \n", (i + 1), numero[i]);
        }

    }
}
