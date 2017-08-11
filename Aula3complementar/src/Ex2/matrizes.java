package Ex2;

import java.util.Random;

public class matrizes {

    public static void main(String[] args) {
        int[][] num1 = new int[4][5];
        int[][] num2 = new int[5][2];
        int[][] resp = new int[4][2];
        Random rand = new Random();
        for (int[] num11 : num1) {
            for (int j = 0; j < num11.length; j++) {
                num11[j] = rand.nextInt(10);
                System.out.print(num11[j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int[] num21 : num2) {
            for (int j = 0; j < num21.length; j++) {
                num21[j] = rand.nextInt(10);
                System.out.print(num21[j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        int aux=1;
        for (int i = 0; i < resp[i].length; i++) {
            for (int j = 0; j < resp.length; j++) {
                for (int k = 0; k < num1.length; k++) {
                    aux*=num1[i][k];
                }
                resp[j][i]=num2[j][i]*aux;
                aux=1;
            }
            
        }
        for (int[] resp1 : resp) {
            for (int j = 0; j < resp1.length; j++) {
                System.out.print(resp1[j] + " ");
            }
            System.out.println("");
        }

    }
}
