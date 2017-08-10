package Ex1;

import java.util.Random;

public class Vetores {

    public static void main(String[] args) {
        int[] num1 = new int[4];//alterar para 10
        int[] num2 = new int[4];
        for (int i = 0; i < num1.length; i++) {
            Random rand = new Random();
            num1[i] = rand.nextInt(10);
            num2[i] = rand.nextInt(10);
            System.out.printf(" %d - %d / %d  \n", i + 1, num1[i], num2[i]);
        }

        System.out.println("\na uniao dos conjuntos: ");
        

        int aux = 0;
        System.out.println("\na diferença entre x e y: ");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                if (num1[i] == num2[j]) {
                    aux++;
                }
            }
            if (aux == 0) {
                aux = 0;
                for (int j = i + 1; j < num1.length; j++) {
                    if (num1[i] == num1[j]) {
                        aux++;
                    }
                }
                if (aux == 0) {
                    System.out.println(num1[i]);
                }
            }
            aux = 0;
        }
        System.out.println("\na soma dos vetores: ");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + num2[i] + " - ");
        }
        System.out.println("\no produto dos vetores: ");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] * num2[i] + " - ");
        }
        System.out.println("\na intersecçao dos vetores: ");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                if (num1[i] == num2[j]) {
                    System.out.print(num1[i] + " - ");
                    break;
                }
            }
        }

    }
}
